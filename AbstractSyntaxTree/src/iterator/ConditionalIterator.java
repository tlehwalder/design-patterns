package iterator;

import expression.Expression;
import visitor.Visitor;

/**
 * Created by tobiaslehwalder on 12/19/14.
 */
public class ConditionalIterator implements Iterator {

    Visitor visitor;

    public ConditionalIterator(Visitor visitor){
        super();
        this.visitor = visitor;
    }

    @Override
    public void traverse(Expression node) {

        if(!node.isLeaf()){
            traverse(node.getLeft());

            if(visitor.getState()){
                return;
            }

            traverse(node.getRight());
        }

        node.accept(visitor);
    }
}
