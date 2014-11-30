package operation;
import expression.Expression;
import visitor.Visitor;

/**
 * Composite
 * 
 * @author isttolehw
 *
 */
public abstract class Operation implements Expression {

	public Expression left;
	public Expression right;
	
	public Operation(Expression left, Expression right){
		this.left = left;
		this.right = right;
	}
	
	public Expression getLeft(){
		return left;
	}
	
	public Expression getRight(){
		return right;
	}

    public abstract void accept(Visitor visitor);

    public boolean isLeaf(){
        return false;
    }

}
