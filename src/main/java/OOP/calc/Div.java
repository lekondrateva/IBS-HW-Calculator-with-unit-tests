package OOP.calc;

public class Div extends Action {

    public Div(double a, double b) {
        Action.a = a;
        Action.b = b;
    }

    @Override
    public double getResult () {
        if (b!=0)
            return a / b;
        else {
            System.out.println("Нельзя разделить на ноль!");
            return -1;
        }
        }
    }