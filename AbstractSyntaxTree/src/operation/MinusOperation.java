package operation;

import expression.Expression;

public class MinusOperation extends Operation {

	public MinusOperation(Expression left, Expression right) {
		super(left, right);
	}


    @Override
    public double operation(double a,double b) {
        return a - b;
    }

    public static String SYMBOL = "-";

	@Override
	public String getSymbol() {
		return SYMBOL;
	}



}
