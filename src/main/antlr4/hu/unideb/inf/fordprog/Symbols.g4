lexer grammar Symbols;

EQ: '=';
TERMINATOR: ';';
NEWLINE: ('\r\n'|'\n'|'\r');
WS  : [ \t]+ -> skip ;