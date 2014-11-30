package expression;

import visitor.Visitor;

public interface Expression {
	public String getSymbol();
    public Expression getLeft();
    public Expression getRight();
    public void accept(Visitor visitor);
    public boolean isLeaf();
}
