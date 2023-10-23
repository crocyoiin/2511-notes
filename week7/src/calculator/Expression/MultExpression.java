package Expression;

public class MultExpression implements Expression {
    private Expression lhs;
    private Expression rhs;

    public MultExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public double compute() {
        return lhs.compute() * rhs.compute();
    }
    
}
