package operation;

import expression.Expression;
import visitor.Visitor;

public class MinusOperation extends Operation {

	public MinusOperation(Expression left, Expression right) {
		super(left, right);
	}

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);

    }

    public static String SYMBOL = "-";

	@Override
	public String getSymbol() {
		return SYMBOL;
	}



}
