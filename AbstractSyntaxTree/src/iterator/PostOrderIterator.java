package iterator;

import expression.Expression;
import visitor.EvaluateVisitor;
import visitor.Visitor;

/**
 * Created by tobiaslehwalder on 12/5/14.
 */
public class PostOrderIterator implements Iterator {

    private Visitor visitor;

    public PostOrderIterator(Visitor visitor){
        super();
        this.visitor = visitor;
    }

    @Override
    public void traverse(Expression node) {
            if(!node.isLeaf()){
                traverse(node.getLeft());
                traverse(node.getRight());
            }

            node.accept(visitor);
        }
}
