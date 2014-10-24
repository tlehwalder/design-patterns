package operation;

import expression.Expression;

public class MulOperation extends Operation {

	public MulOperation(Expression left, Expression right) {
		super(left, right);
	}

	public static char SYMBOL = '*';

	
	@Override
	public void print() {
		System.out.print('(');
		left.print();
		System.out.print(SYMBOL);
		right.print();
		System.out.print(')');
	}

	@Override
	public double evaluate() {
		return left.evaluate() * right.evaluate();
	}

	@Override
	public char getSymbol() {
		return SYMBOL;
	}

}
