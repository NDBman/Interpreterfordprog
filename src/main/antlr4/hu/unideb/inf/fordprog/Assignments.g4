grammar Assignments;
import Values, Symbols;

assignment: NAME EQ VALUE TERMINATOR NEWLINE?;
NAME: CHAR+;

