package OOP.calc;

public class Add extends Action {

    public Add(double a, double b) {
        Action.a = a;
        Action.b = b;
    }

    @Override
    public double getResult() {
        return a + b;
    }
}
