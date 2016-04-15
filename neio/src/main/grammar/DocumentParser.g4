parser grammar DocumentParser;

options { tokenVocab = DocumentLexer; }

document : HEADER mnl
           body
           EOF;

body : content*;
content : ( prefixCall
          | text
          | scode
          | lonecode)
          mnl?;

prefixCall : MethodName S txt;
// We don't allow spaces next to the MethodName to not confuse us with prefixCalls
surroundCall : left=(MethodName|HASH|DASH|STAR|BQ|US)+ (inlinecode | WORD) txt? right=(HASH|DASH|STAR|BQ|US)+ {$left.text.equals($right.text)}?;

text : sentence+;

sentence : txt NL;
txt : (S* (inlinecode | WORD | surroundCall) S*)+;
mnl : NL+;

scode : SCOPED_CODE;
lonecode : LONE_CODE;
inlinecode : CODE CCONTENT;