grammar Assignments;
import Values, Symbols;

assignment: NAME EQ VALUE TERMINATOR;
NAME: CHAR+;
CHAR: 'A'..'Z'|'a'..'z';
