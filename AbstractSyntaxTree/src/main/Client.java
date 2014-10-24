package main;

import operand.Operand;
import operation.MinusOperation;
import operation.MulOperation;
import operation.Operation;
import operation.PlusOperation;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Operation root = new PlusOperation(
				new MulOperation(
						new PlusOperation(new Operand('a', 3), new Operand('b', 7)), 
						new MinusOperation(new Operand('a', 3), new Operand('c', 12))),
				new MinusOperation(
						new MulOperation(new Operand('b', 7), new Operand('d', 2)), 
						new Operand('a', 3)));
	
		root.print();
		
		System.out.println(" = " + root.evaluate());
	}

}
