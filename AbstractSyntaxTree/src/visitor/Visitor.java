package visitor;

import iterator.Iterator;
import operand.Constant;
import operand.Operand;
import operation.*;

/**
 * Created by tobiaslehwalder on 11/11/14.
 */
public interface Visitor {

    public void visit(PlusOperation e);
    public void visit(MinusOperation e);
    public void visit(MulOperation e);
    public void visit(IfOperation e);
    public void visit(LessOperation e);
    public void visit(AssignOperation e);

    public void visit(Operand e);
    public void visit(Constant e);

    public void setVisitedCount(int i);
    public Iterator createIterator();
    public boolean getState();
}
