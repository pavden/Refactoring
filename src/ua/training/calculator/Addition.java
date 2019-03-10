package ua.training.calculator;

public class Addition implements Operation<Integer> {

    @Override
    public Integer calculate(Integer first, Integer second) {
        return first + second;
    }

    @Override
    public String toString() {
        return "addition operation";
    }

}
