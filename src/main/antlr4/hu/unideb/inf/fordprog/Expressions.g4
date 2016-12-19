grammar Expressions;
import Types, Values, Symbols;

expression: type NAME EQ VALUE TERMINATOR;
NAME: CHAR+;
CHAR: 'A'..'Z'|'a'..'z';
