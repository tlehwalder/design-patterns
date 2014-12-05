package iterator;

import expression.Expression;
import visitor.EvaluateVisitor;
import visitor.Visitor;

/**
 * Created by tobiaslehwalder on 11/7/14.
 */
public interface Iterator {

    public void traverse(Expression node);

}
