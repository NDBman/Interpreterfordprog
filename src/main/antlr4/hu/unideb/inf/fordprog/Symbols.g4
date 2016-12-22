lexer grammar Symbols;

EQ: '=';
TERMINATOR: ';';
OPEN_BRACKET: '(';
CLOSE_BRACKET: ')';
NEWLINE: ('\r\n'|'\n'|'\r');
CHAR: 'A'..'Z'|'a'..'z';
WS  : [ \t]+ -> skip ;