package iterator;

import expression.Expression;
import visitor.EvaluateVisitor;
import visitor.Visitor;

/**
 * Created by tobiaslehwalder on 11/7/14.
 */
public class Iterator {

    private Visitor visitor;

    public Iterator(Visitor visitor) {
        this.visitor = visitor;
    }

    public void traverseInOrder(Expression node){
        if(!node.isLeaf()) {
            visitor.setVisitedCount(1);
            node.accept(visitor);
            traverseInOrder(node.getLeft());
        }

        visitor.setVisitedCount(2);
        node.accept(visitor);

        if(!node.isLeaf()) {
            traverseInOrder(node.getRight());
            visitor.setVisitedCount(3);
            node.accept(visitor);
        }
    }

    public void traversePostOrder(Expression node, Visitor visitor){
        if(!node.isLeaf()){
            traversePostOrder(node.getLeft(), visitor);
            traversePostOrder(node.getRight(), visitor);
        }

        node.accept(visitor);
    }

}
