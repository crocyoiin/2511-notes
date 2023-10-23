package Expression;

public class AddExpression implements Expression {
    private Expression lhs;
    private Expression rhs;

    public AddExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public double compute() {
        return lhs.compute() + rhs.compute();
    }
    
}
