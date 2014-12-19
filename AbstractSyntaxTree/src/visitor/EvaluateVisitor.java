package visitor;

import expression.Expression;
import iterator.ConditionalIterator;
import iterator.PostOrderIterator;
import iterator.Iterator;
import operand.Constant;
import operand.Operand;
import operation.*;

import java.util.Stack;

/**
 * Created by tobiaslehwalder on 11/11/14.
 */
public class EvaluateVisitor implements Visitor {

    private Stack<Double> operandStack;
    private boolean state = false;
    private int visitedCount;

    public EvaluateVisitor() {
        this.operandStack = new Stack<Double>();
        this.visitedCount = 0;
    }

    @Override
    public void visit(PlusOperation e) {
        double right = operandStack.pop();
        double left = operandStack.pop();
        operandStack.push(left + right);
    }

    @Override
    public void visit(MinusOperation e) {
        double right = operandStack.pop();
        double left = operandStack.pop();
        operandStack.push(left - right);

    }

    @Override
    public void visit(MulOperation e) {
        double right = operandStack.pop();
        double left = operandStack.pop();
        operandStack.push(left * right);
    }

    @Override
    public void visit(IfOperation e) {}

    @Override
    public void visit(LessOperation e) {
        Double left = operandStack.pop();
        Double right = operandStack.pop();

        state = left < right;
    }

    @Override
    public void visit(AssignOperation e) {
        Constant constant = (Constant) e.getLeft();
        constant.setValue(this.getResult());
    }

    @Override
    public void visit(Operand operand) {
        operandStack.push(operand.getValue());
    }

    @Override
    public void visit(Constant e) {
        operandStack.push(e.getValue());
    }

    @Override
    public void setVisitedCount(int i) {
        this.visitedCount = i;
    }

    @Override
    public Iterator createIterator() {
        return new ConditionalIterator(this);
    }

    public double getResult(){
        return operandStack.pop();
    }

    public boolean getState() {
        return state;
    }

}