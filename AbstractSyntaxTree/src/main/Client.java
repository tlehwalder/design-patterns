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


        Operand a = new Operand('a', 3);
        Operand b = new Operand('b', 7);
        Operand c = new Operand('c', 12);
        Operand d = new Operand('d', 2);

        Operation root = new PlusOperation(
				new MulOperation(
						new PlusOperation(a, b),
						new MinusOperation(a, c)),
				new MinusOperation(
						new MulOperation(b, d),
                        a));
	
		root.print();
		
		System.out.println(" = " + root.evaluate());
	}

}
