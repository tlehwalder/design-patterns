package iterator;

import expression.Expression;
import visitor.Visitor;

/**
 * Created by tobiaslehwalder on 12/5/14.
 */
public class PreOrderIterator implements Iterator {

    private Visitor visitor;

    public PreOrderIterator(Visitor visitor){
        super();
        this.visitor = visitor;
    }

    @Override
    public void traverse(Expression node) {
        node.accept(visitor);

        if(!node.isLeaf()){
            traverse(node.getLeft());
            traverse(node.getRight());
        }
    }
}
