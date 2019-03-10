package ua.training.calculator;

public class Concatenation implements Operation<String> {

    @Override
    public String calculate(String first, String second) {
        return first + second;
    }

    @Override
    public String toString() {
        return "concatenation operation";
    }

}
