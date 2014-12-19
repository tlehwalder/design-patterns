package operand;

import expression.Expression;
import visitor.Visitor;

/**
 * Created by tobiaslehwalder on 12/19/14.
 */
public class Constant implements Expression {
    private char symbol;
    private double value;

    public Constant(char symbol, double value) {
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String getSymbol() {
        return "x";
    }

    /**
     *
     * @return null, because Leaf cannot have childs
     */
    @Override
    public Expression getLeft() {
        return null;
    }

    /**
     *
     * @return null, because Leaf cannot have childs
     */
    @Override
    public Expression getRight() {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public String toString(){
        return symbol + " = " + String.valueOf(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
