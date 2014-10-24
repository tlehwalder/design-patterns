package operand;
import expression.Expression;

/**
 * Leaf
 * 
 * @author isttolehw
 *
 */
public class Operand implements Expression {

	private double value;
	private char name;
	
	public Operand(char name, double value){
		this.name = name;
		this.value = value;
	}
	
	@Override
	public void print() {
		System.out.print(value);
	}

	@Override
	public double evaluate() {
		return value;
	}

	@Override
	public char getSymbol() {
		return name;
	}

}
