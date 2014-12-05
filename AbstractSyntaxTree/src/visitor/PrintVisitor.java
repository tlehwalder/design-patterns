package visitor;

import iterator.Iterator;
import iterator.PrintIterator;
import operand.Operand;
import operation.MinusOperation;
import operation.MulOperation;
import operation.PlusOperation;

/**
 * Created by tobiaslehwalder on 11/30/14.
 */
public class PrintVisitor implements Visitor{

    private int visitedCount;

    public PrintVisitor(){
        this.visitedCount = 0;
    }

    @Override
    public void visit(PlusOperation e) {
        switch(visitedCount){
            case 1:
                System.out.print("(");
                break;
            case 2:
                System.out.print("+");
                break;
            case 3:
                System.out.print(")");
                break;
        }
    }

    @Override
    public void visit(MinusOperation e) {
        switch(visitedCount){
            case 1:
                System.out.print("(");
                break;
            case 2:
                System.out.print("-");
                break;
            case 3:
                System.out.print(")");
                break;
        }

    }

    @Override
    public void visit(MulOperation e) {
        switch(visitedCount){
            case 1:
                System.out.print("(");
                break;
            case 2:
                System.out.print("*");
                break;
            case 3:
                System.out.print(")");
                break;
        }


    }

    @Override
    public void visit(Operand e) {
        System.out.print(e.getValue());
    }

    @Override
    public void setVisitedCount(int visitedCount) {
        this.visitedCount = visitedCount;
    }

    @Override
    public Iterator createIterator() {
        return new PrintIterator(this);
    }
}
