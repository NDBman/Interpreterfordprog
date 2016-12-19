grammar Interpreter;
import Expressions, Symbols;

prog: start;

start: expression EOF;