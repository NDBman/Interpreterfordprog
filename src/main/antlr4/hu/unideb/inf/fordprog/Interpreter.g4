grammar Interpreter;
import Assignments, Symbols, Functions;

prog: start;

start: (function | assignment)*  EOF;