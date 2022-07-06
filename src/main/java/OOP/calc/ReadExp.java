package OOP.calc;

public class ReadExp {
    private String line;
    private String[] parseLine;

    public ReadExp(String exp) {
        line = exp;
        parseLine = line.split(" ");
    }

    public double getA() {
        return Double.parseDouble(parseLine[0]);
    }

    public double getB() {
        return Double.parseDouble(parseLine[2]);
    }

    public String getOperation() throws Exception {
        return switch (parseLine[1]) {
            case "+", "-", "/", "*" -> parseLine[1];
            default -> throw new Exception("Недопустимые символы!");
        };
    }
}