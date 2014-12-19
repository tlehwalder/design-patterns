package visitor;

import iterator.InOrderIterator;
import iterator.Iterator;
import operand.Constant;
import operand.Operand;
import operation.*;

/**
 * Created by tobiaslehwalder on 11/30/14.
 */
public class PrintVisitor implements Visitor{

    protected int visitedCount;

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
    public void visit(IfOperation e) {
        // TODO: implement me
    }

    @Override
    public void visit(LessOperation e) {
        // TODO: implement me
    }

    @Override
    public void visit(AssignOperation e) {
        // TODO: implement me
    }

    @Override
    public void visit(Operand e) {
        System.out.print(e.getValue());
    }

    @Override
    public void visit(Constant e) {
        // TODO: implement me
    }

    @Override
    public void setVisitedCount(int visitedCount) {
        this.visitedCount = visitedCount;
    }

    @Override
    public Iterator createIterator() {
        return new InOrderIterator(this);
    }

    @Override
    public boolean getState() {
        return false;
    }
}
