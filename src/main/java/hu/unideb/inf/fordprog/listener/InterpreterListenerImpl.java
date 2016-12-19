package hu.unideb.inf.fordprog.listener;

import hu.unideb.inf.fordprog.InterpreterBaseListener;
import hu.unideb.inf.fordprog.InterpreterParser;

public class InterpreterListenerImpl extends InterpreterBaseListener {

	@Override
	public void enterStart(InterpreterParser.StartContext ctx) {
		String name = ctx.expression().NAME().getText();
		String value = ctx.expression().VALUE().getText();
		System.out.println("Value for: " + name + " is: " + value);
	}
}
