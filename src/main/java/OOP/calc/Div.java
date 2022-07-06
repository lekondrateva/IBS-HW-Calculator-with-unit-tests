package OOP.calc;

public class Div extends Action {

    public Div(double a, double b) {
        Action.a = a;
        Action.b = b;
    }

    @Override
    public double getResult() throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Нельзя разделить на ноль!");
        } else
            return a / b;
    }
}
