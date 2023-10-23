package Expression;

public class Number implements Expression {
    private double value;

    public Number(double val) {
        value = val;
    }

    @Override
    public double compute() {
        return value;
    }
    
}
