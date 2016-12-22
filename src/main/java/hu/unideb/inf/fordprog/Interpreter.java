package hu.unideb.inf.fordprog;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import hu.unideb.inf.fordprog.listener.InterpreterListenerImpl;

public class Interpreter {

	private static final String PATH = "hu/unideb/inf/fordprog/";

	private ANTLRInputStream input;
	private InterpreterLexer lexer;
	private CommonTokenStream tokens;
	private InterpreterParser parser;

	@SuppressWarnings("resource")
	public void start(String fileName) throws IOException {
		InputStream is;
		if (fileName == null) {
			Scanner scanner = new Scanner(System.in);
			while (true) {
				String inputText = null;
				inputText = scanner.nextLine();
				is = new ByteArrayInputStream(inputText.getBytes(StandardCharsets.UTF_8));
				initParser(is);
				walkParseTree();

			}
			
		}else{
			File file = new File(Interpreter.class.getClassLoader().getResource(PATH + fileName).getFile());
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while((line = reader.readLine()) != null){
				InputStream istream = new ByteArrayInputStream(line.getBytes());
				initParser(istream);
				walkParseTree();
			}

		}
	}
	
	private void walkParseTree(){
		ParseTree tree = parser.start();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new InterpreterListenerImpl(), tree);
		
	}
	
	private void initParser(InputStream inputStream) throws IOException{
		input = new ANTLRInputStream(inputStream);
		lexer = new InterpreterLexer(input);
		tokens = new CommonTokenStream(lexer);
		parser = new InterpreterParser(tokens);
	}

	public static void main(String[] args) throws IOException {
		Interpreter interpreter = new Interpreter();
		if(args.length == 0){
			interpreter.start(null);
		}else{
			interpreter.start(args[0]);
		}
	}
}
