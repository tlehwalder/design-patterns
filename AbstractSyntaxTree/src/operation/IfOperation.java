package operation;

import expression.Expression;
import visitor.Visitor;

/**
 * Created by tobiaslehwalder on 12/19/14.
 */
public class IfOperation extends Operation {
    public IfOperation(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String getSymbol() {
        return "if";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
