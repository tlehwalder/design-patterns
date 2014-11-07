package iterator;

import expression.Expression;

/**
 * Created by tobiaslehwalder on 11/7/14.
 */
public class EvaluateIterator {

    public double evaluate(Expression node){
        double a =0;
        double b =0;
        if(node.getLeft()!= null) {
            a = evaluate(node.getLeft());
        }

        if(node.getRight() != null) {
            b = evaluate(node.getRight());
        }
        return node.operation(a,b);
    }

}
