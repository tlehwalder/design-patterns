package operation;

import expression.Expression;
import visitor.Visitor;

public class MulOperation extends Operation {

	public MulOperation(Expression left, Expression right) {
		super(left, right);
	}

    public static String SYMBOL = "*";

	@Override
	public String getSymbol() {
		return SYMBOL;
	}


    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);

    }

}
