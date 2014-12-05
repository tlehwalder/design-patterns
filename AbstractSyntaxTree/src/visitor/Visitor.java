package visitor;

import iterator.Iterator;
import operand.Operand;
import operation.MinusOperation;
import operation.MulOperation;
import operation.PlusOperation;

/**
 * Created by tobiaslehwalder on 11/11/14.
 */
public interface Visitor {

    public void visit(PlusOperation e);
    public void visit(MinusOperation e);
    public void visit(MulOperation e);
    public void visit(Operand e);
    public void setVisitedCount(int i);
    public Iterator createIterator();
}
