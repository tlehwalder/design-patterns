package expression;

public interface Expression {
	public String getSymbol();
    public Expression getLeft();
    public Expression getRight();
    public double operation(double a, double b);
}
