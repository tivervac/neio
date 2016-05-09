package be.ugent.neio;

import be.kuleuven.cs.distrinet.jnome.workspace.JavaView;
import be.ugent.chameleonsupport.build.LanguageBuilder;
import be.ugent.neio.builder.NeioClassBuilder;
import be.ugent.neio.builder.NeioProjectBuilder;
import be.ugent.neio.builder.NeioScriptBuilder;
import be.ugent.neio.industry.CopyDocumentWriterFactory;
import be.ugent.neio.industry.LazyFileTextFactory;
import be.ugent.neio.industry.NeioDocumentModelFactory;
import be.ugent.neio.model.io.CopyBuilder;
import be.ugent.neio.model.io.CopyDocumentFactory;
import be.ugent.neio.model.util.NotExtensionPredicate;
import org.aikodi.chameleon.input.ModelFactory;
import org.aikodi.chameleon.plugin.build.BuildException;
import org.aikodi.chameleon.workspace.*;

import java.io.File;

import static be.ugent.neio.util.Constants.AUTO_GEN_DIR;
import static be.ugent.neio.util.Constants.EXTENSION;

public class Main {

    private static final boolean DEBUG = false;

    /**
     * args[1] = input path
     * args[2] = project.xml file
     * args[3] = output path (optional)
     * <p>
     * Exit code 1: Invalid call to program
     * Exit code 2: Input path can not be read or does not exist
     * Exit code 3: Could not build everything in NEIO_HOME
     * Exit code 4: Could not build all the resources in input path
     * Exit code 5: Could not build all source files in input path
     */
    public static void main(String[] args) {
        new Main().read(args);
    }

    private void read(String[] args) {
        String inputPath = getInputPath(args);
        String projectXml = getProjectXml(args);
        String outputPath = getOutputPath(args);
        if (outputPath == null) {
            outputPath = AUTO_GEN_DIR;
        }
        NeioProjectBuilder projectBuilder = new NeioProjectBuilder();
        View view = projectBuilder.build(projectXml);

        File output = new File(outputPath);
        LanguageBuilder languageBuilder = new NeioClassBuilder(view);
        try {
            languageBuilder.buildAll(output, null);
        } catch (BuildException e) {
            e.printStackTrace();
            System.exit(3);
        }

        translateDocuments(inputPath, output, (JavaView) view);
    }

    private String getInputPath(String[] args) {
        checkArgsLength(args, 2);
        return getArg(args, 0);
    }

    private String getProjectXml(String[] args) {
        checkArgsLength(args, 2);
        return getArg(args, 1);
    }

    private String getOutputPath(String[] args) {
        if (args.length < 3) {
            return null;
        }

        return getArg(args, 2);
    }

    private void checkArgsLength(String[] args, int length) {
        if (args.length < length) {
            printHelp("neio.jar");
            System.exit(1);
        }
    }

    private String getArg(String[] args, int position) {
        String path = args[position];
        File inputFile = new File(path);
        if (!inputFile.canRead()) {
            System.err.println(path + " isn't a valid folder or it isn't readable.");
            System.exit(2);
        }

        return path;
    }

    private void printHelp(String programName) {
        System.out.println("USAGE: java -jar " + programName + " <path-to-inputfile-directory> <path-to-project.xml> (optional)<path-to-outputdir>");
    }

    private void translateDocuments(String inputPath, File output, JavaView view) {
        try {
            DirectoryScanner resourceScanner = new DirectoryScanner(inputPath,
                    new NotExtensionPredicate(EXTENSION), new CopyDocumentFactory());
            view.addSource(resourceScanner);

            CopyBuilder lb = new CopyBuilder(view, new CopyDocumentWriterFactory());
            try {
                lb.buildAll(resourceScanner.documents(), output, null);
            } catch (BuildException | InputException e) {
                e.printStackTrace();
                System.exit(4);
            }

            // We're done scanning Neio class files, change the classparser to the documentparser
            view.language().setPlugin(ModelFactory.class, new NeioDocumentModelFactory());
            DirectoryScanner scanner = new DirectoryScanner(inputPath,
                    new ExtensionPredicate(EXTENSION), new LazyFileTextFactory());
            view.addSource(scanner);

            NeioScriptBuilder builder = new NeioScriptBuilder(view, DEBUG);
            try {
                builder.buildAll(scanner.documents(), output, null);
            } catch (BuildException | InputException e) {
                e.printStackTrace();
                System.exit(5);
            }
        } catch (ProjectException e) {
            e.printStackTrace();
        }
    }
}