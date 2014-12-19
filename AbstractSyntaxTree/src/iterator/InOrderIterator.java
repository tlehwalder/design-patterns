package iterator;

import expression.Expression;
import iterator.Iterator;
import visitor.PrintVisitor;

/**
 * Created by tobiaslehwalder on 12/5/14.
 */
public class InOrderIterator implements Iterator {

    private PrintVisitor visitor;

    public InOrderIterator(PrintVisitor printVisitor) {
        super();
        this.visitor = printVisitor;
    }

    @Override
    public void traverse(Expression node){
        if(!node.isLeaf()) {
            visitor.setVisitedCount(1);
            node.accept(visitor);
            traverse(node.getLeft());
        }

        visitor.setVisitedCount(2);
        node.accept(visitor);

        if(!node.isLeaf()) {
            traverse(node.getRight());
            visitor.setVisitedCount(3);
            node.accept(visitor);
        }
    }

}
