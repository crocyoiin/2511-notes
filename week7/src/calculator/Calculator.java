import Expression.*;
import Expression.Number;

public class Calculator {
    private Expression e;

    public Calculator(Expression e) {
        this.e = e;
    }

    public double compute() {
        return e.compute();
    }

    public static void main(String[] args) {
        // test addition
        Expression add = new AddExpression(new Number(1), new Number(2));
        System.out.println(add.compute());

        // something more complex?
        // ((1 + 2) + (3 / 4)) - ((5 / 10) * (7 * 8)) = -24.25
        Calculator c = new Calculator(
            new SubExpression(
                new AddExpression(
                    new AddExpression(new Number(1), new Number(2)),
                    new DivExpression(new Number(3), new Number(4))
                ),
                new MultExpression(
                    new DivExpression(new Number(5), new Number(10)),
                    new MultExpression(new Number(7), new Number(8))
                )
            )
        );
        System.out.println(c.compute());

    }
    
}
