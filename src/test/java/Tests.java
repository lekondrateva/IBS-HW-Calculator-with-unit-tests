import OOP.calc.Calculator;
import OOP.calc.ReadExp;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void add () {
        Calculator calculator = new Calculator(5.0, "+", 6.0);
        Assert.assertEquals(11.0, calculator.calculate().getResult(), 0);
    }

    @Test
    public void multiple () {
        Calculator calculator = new Calculator(5.0, "*", 6.0);
        Assert.assertEquals(30.0, calculator.calculate().getResult(), 0);
    }

    @Test
    public void divide () {
        Calculator calculator = new Calculator(5.0, "/", 2.0);
        Assert.assertEquals(2.5, calculator.calculate().getResult(), 0);
    }

    @Test
    public void subtract () {
        Calculator calculator = new Calculator(5.0, "-", 2.0);
        Assert.assertEquals(3.0, calculator.calculate().getResult(), 0);
    }

    @Test (expected = ArithmeticException.class)
    public void divideByZero () {
        Calculator calculator = new Calculator(5.0, "/", 0.0);
        calculator.calculate().getResult();
    }

    @Test (expected = NumberFormatException.class)
    public void calcIncorrectInputA () {
        ReadExp readExp = new ReadExp("a + 5");
        readExp.getA();
    }

    @Test (expected = NumberFormatException.class)
    public void calcIncorrectInputB () {
        ReadExp readExp = new ReadExp("5 + b");
        readExp.getB();
    }

    @Test (expected = Exception.class)
    public void calcIncorrectInputOperation () throws Exception {
        ReadExp readExp = new ReadExp("5 = 5");
        readExp.getOperation();
    }

    @Test (expected = Exception.class)
    public void calcIncorrectInputExpression () throws Exception {
        ReadExp readExp = new ReadExp("asdfsad");
        Calculator calculator = new Calculator(readExp.getA(), readExp.getOperation(), readExp.getB());
    }
}
