grammar Assignments;
import Types, Values, Symbols;

assignment: type NAME EQ VALUE TERMINATOR;
NAME: CHAR+;
CHAR: 'A'..'Z'|'a'..'z';
