package Expression;

public class SubExpression implements Expression {
    private Expression lhs;
    private Expression rhs;

    public SubExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public double compute() {
        return lhs.compute() - rhs.compute();
    }
    
}
