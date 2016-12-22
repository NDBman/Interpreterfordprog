grammar Functions;
import Assignments, Symbols;

function:  functionBody NEWLINE?;

functionBody: Function_Name OPEN_BRACKET NAME CLOSE_BRACKET TERMINATOR;
Function_Name: '_' CHAR+;