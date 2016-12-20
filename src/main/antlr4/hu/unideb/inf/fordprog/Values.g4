lexer grammar Values;
import Symbols, Operators;

VALUE: NUM|LIST|EXPR;

NUM: [0-9]+;
LIST: ('list' OPEN_BRACKET ((NUM|EXPR) (COMMA (NUM|EXPR))*) CLOSE_BRACKET);
EXPR: ('expr' OPEN_BRACKET ((NUM OP NUM) (OP NUM)*) CLOSE_BRACKET);