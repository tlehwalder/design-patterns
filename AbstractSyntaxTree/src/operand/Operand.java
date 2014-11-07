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
	public String getSymbol() {
		return String.valueOf(value);
	}

    /**
     *
     * @return false, because Leaf cannot have childs
     */
    @Override
    public Expression getLeft() {
        return null;
    }

    /**
     *
     * @return null, because Leaf cannot have childs
     */
    @Override
    public Expression getRight() {
        return null;
    }

    @Override
    public double operation(double a, double b){
        return value;
    }


}
