package main;

import iterator.Iterator;
import operand.Constant;
import operand.Operand;
import operation.*;
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


        Operation evalTree = new PlusOperation(
                new MulOperation(
                        new PlusOperation(a, b),
                        new MinusOperation(a, c)),
                new MinusOperation(
                        new MulOperation(b, d),
                        a));

        Constant x = new Constant('x', 6);
        Operand z = new Operand('z', 0);

        LessOperation less = new LessOperation(x, z);
        AssignOperation assign = new AssignOperation(x, evalTree);

        Operation root = new IfOperation(less, assign);

        // -------- Initialize Visitors --------
        EvaluateVisitor evaluateVisitor = new EvaluateVisitor();

        // -------- Initialize Iterators --------
        Iterator evaluateIterator = evaluateVisitor.createIterator();

        evaluateIterator.traverse(root);

        System.out.println(x);

	}

}
