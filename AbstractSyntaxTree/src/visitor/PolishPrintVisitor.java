package visitor;

import iterator.Iterator;
import iterator.PreOrderIterator;
import operand.Operand;
import operation.MinusOperation;
import operation.MulOperation;
import operation.PlusOperation;

/**
 * Created by tobiaslehwalder on 12/5/14.
 */
public class PolishPrintVisitor extends PrintVisitor{


    public PolishPrintVisitor(){
        super();
    }

    @Override
    public void visit(PlusOperation e) {
        System.out.print("+ ");
    }

    @Override
    public void visit(MinusOperation e) {
        System.out.print("- ");

    }

    @Override
    public void visit(MulOperation e) {
        System.out.print("* ");

    }

    @Override
    public void visit(Operand e) {
        System.out.print(e.getValue() + " ");
    }

    @Override
    public void setVisitedCount(int i) {
        // not implemented
    }

    @Override
    public Iterator createIterator() {
        return new PreOrderIterator(this);
    }
}
