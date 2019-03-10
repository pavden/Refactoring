package ua.training.calculator;

public class Subtraction implements Operation<Integer> {

    @Override
    public Integer calculate(Integer first, Integer second) {
        return first - second;
    }

    @Override
    public String toString() {
        return "subtraction operation";
    }

}
