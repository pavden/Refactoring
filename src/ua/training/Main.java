package ua.training;

import ua.training.calculator.*;

public class Main {

    public static void main(String[] args) {
        int a = 6;
        int b = 4;

        System.out.println("For integers a=" + a + " and b=" + b + ":");
        Operation.printResult(new Addition(), a, b);
        Operation.printResult(new Subtraction(), a, b);
        Operation.printResult(new Multiplication(), a, b);
        Operation.printResult(new Division(), a, b);
        Operation.printResult(new Concatenation(), String.valueOf(a), String.valueOf(b));
    }

}
