package hu.unideb.inf.fordprog.listener;

import hu.unideb.inf.fordprog.Assignments;
import hu.unideb.inf.fordprog.Functions;
import hu.unideb.inf.fordprog.InterpreterBaseListener;
import hu.unideb.inf.fordprog.InterpreterParser;
import hu.unideb.inf.fordprog.InterpreterParser.AssignmentContext;

public class InterpreterListenerImpl extends InterpreterBaseListener {

	@Override
	public void enterStart(InterpreterParser.StartContext ctx) {
		for(AssignmentContext aCtx : ctx.assignment()){
			Assignments.assignmentsMap.put(aCtx.NAME().getText(), aCtx.VALUE().getText());
		}
		Functions.execute(ctx.function());
	}
}
