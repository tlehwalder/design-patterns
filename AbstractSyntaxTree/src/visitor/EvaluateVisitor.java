package visitor;

import operand.Operand;
import operation.MinusOperation;
import operation.MulOperation;
import operation.PlusOperation;

import java.util.Stack;

/**
 * Created by tobiaslehwalder on 11/11/14.
 */
public class EvaluateVisitor implements Visitor {

    private Stack<Double> operandStack;
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
    public void visit(Operand operand) {
        operandStack.push(operand.getValue());
    }

    @Override
    public void setVisitedCount(int i) {
        this.visitedCount = i;
    }

    public double getResult(){
        return operandStack.pop();
    }

}