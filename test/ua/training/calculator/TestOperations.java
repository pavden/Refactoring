package ua.training.calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestOperations {

    private static Addition addition;
    private static Subtraction subtraction;
    private static Multiplication multiplication;
    private static Division division;
    private static Concatenation concatenation;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @BeforeClass
    public static void initialize() {
        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();
        concatenation = new Concatenation();
    }

    @Test
    public void testAddition() {
        Assert.assertEquals(21, addition.calculate(14, 7).intValue());
        Assert.assertEquals(14, addition.calculate(5, 9).intValue());
        Assert.assertEquals(19, addition.calculate(11, 8).intValue());
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(7, subtraction.calculate(14, 7).intValue());
        Assert.assertEquals(-4, subtraction.calculate(5, 9).intValue());
        Assert.assertEquals(3, subtraction.calculate(11, 8).intValue());
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(98, multiplication.calculate(14, 7).intValue());
        Assert.assertEquals(45, multiplication.calculate(5, 9).intValue());
        Assert.assertEquals(88, multiplication.calculate(11, 8).intValue());
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(2, division.calculate(14, 7).intValue());
        Assert.assertEquals(0, division.calculate(5, 9).intValue());
        Assert.assertEquals(1, division.calculate(11, 8).intValue());
    }

    @Test
    public void testDivisionByZero() {
        exception.expect(ArithmeticException.class);
        division.calculate(0, 0);
    }

    @Test
    public void testConcatenation() {
        Assert.assertEquals("147", concatenation.calculate("14", "7"));
        Assert.assertEquals("59", concatenation.calculate("5", "9"));
        Assert.assertEquals("118", concatenation.calculate("11", "8"));
    }

}