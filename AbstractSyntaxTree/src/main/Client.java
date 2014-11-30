package main;

import iterator.Iterator;
import operand.Operand;
import operation.MinusOperation;
import operation.MulOperation;
import operation.Operation;
import operation.PlusOperation;
import visitor.EvaluateVisitor;
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
        Iterator iterator = new Iterator(evaluateVisitor);

        iterator.traversePostOrder(root, evaluateVisitor);

        iterator = new Iterator(printVisitor);
        iterator.traverseInOrder(root);
        System.out.print("= " + evaluateVisitor.getResult());

	}

}
