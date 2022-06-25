package OOP.calc;

public class Main {
    public static void main(String[] args) {
        String expression = "11 / 5";

        ReadExp readExp = new ReadExp(expression);
        Calculator calculator = new Calculator(readExp.getA(), readExp.getOperation(), readExp.getB());
        System.out.println(calculator.calculate().getResult());
    }
}