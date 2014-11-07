package iterator;

import expression.Expression;

/**
 * Created by tobiaslehwalder on 11/7/14.
 */
public class PrintIterator{

    public void print(Expression node){
        if(node.getLeft()!= null) {
            System.out.print("(");
            print(node.getLeft());
        }

        System.out.print(node.getSymbol());

        if(node.getRight() != null) {
            print(node.getRight());
            System.out.print(")");
        }

    }

}
