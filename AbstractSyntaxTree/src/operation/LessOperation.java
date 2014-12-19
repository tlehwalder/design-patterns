package operation;

import expression.Expression;
import visitor.Visitor;

/**
 * Created by tobiaslehwalder on 12/19/14.
 */
public class LessOperation extends Operation{
    public LessOperation(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String getSymbol() {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
