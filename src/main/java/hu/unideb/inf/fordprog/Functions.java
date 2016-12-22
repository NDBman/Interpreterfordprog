package hu.unideb.inf.fordprog;

import java.util.List;

import hu.unideb.inf.fordprog.InterpreterParser.FunctionContext;

public class Functions {

	public static void execute(List<FunctionContext> functions){
		if(functions.size() > 0){
			for(FunctionContext fCtx : functions){
				if(fCtx.functionBody().Function_Name().getText().equals("_print")){
					System.out.println(Assignments.assignmentsMap.get(fCtx.functionBody().NAME().getText()));
				}
			}
		}
	}
}
