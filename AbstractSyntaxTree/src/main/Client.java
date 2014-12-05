package main;

import iterator.Iterator;
import operand.Operand;
import operation.MinusOperation;
import operation.MulOperation;
import operation.Operation;
import operation.PlusOperation;
import visitor.EvaluateVisitor;
import visitor.PolishPrintVisitor;
import visitor.PrintVisitor;

public class Client {

	/**
     *
     * (((3.0+7.0)*(3.0-12.0))+((7.0*2.0)-3.0)) = -79.0
     *
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
	

        PrintVisitor printVisitor = new PrintVisitor();
        EvaluateVisitor evaluateVisitor = new EvaluateVisitor();
        PolishPrintVisitor polishPrintVisitor = new PolishPrintVisitor();

        Iterator printIterator = printVisitor.createIterator();
        Iterator evaluateIterator = evaluateVisitor.createIterator();
        Iterator polishIterator = polishPrintVisitor.createIterator();

        printIterator.traverse(root);
        evaluateIterator.traverse(root);

        System.out.print("= " + evaluateVisitor.getResult());

        System.out.print("\nPolish Notation:\n");
        polishIterator.traverse(root);
	}

}
