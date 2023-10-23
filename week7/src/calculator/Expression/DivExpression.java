package Expression;

public class DivExpression implements Expression {
    private Expression lhs;
    private Expression rhs;

    public DivExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public double compute() {
        return lhs.compute() / rhs.compute();
    }
    
}
