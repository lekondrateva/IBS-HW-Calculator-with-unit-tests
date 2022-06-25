package OOP.calc;

public class Multi extends Action {

    public Multi(double a, double b) {
        Action.a = a;
        Action.b = b;
    }

    @Override
    public double getResult() {
        return a * b;
    }
}