package OOP.calc;

public class Calculator {
    private String operation;
    private double a;
    private double b;

    public Calculator(double a, String operation, double b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    public Action calculate() {
        return switch (operation) {
            case "+" -> new Add(a, b);
            case "-" -> new Sub(a, b);
            case "*" -> new Multi(a, b);
            case "/" -> new Div(a, b);
            default -> null;
        };
    }
}