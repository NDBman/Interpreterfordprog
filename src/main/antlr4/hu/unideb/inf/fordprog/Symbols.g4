lexer grammar Symbols;

EQ: '=';
TERMINATOR: ';';
OPEN_BRACKET: '(';
CLOSE_BRACKET: ')';
NEWLINE: ('\r\n'|'\n'|'\r');
WS  : [ \t]+ -> skip ;