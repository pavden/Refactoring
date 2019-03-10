package ua.training.calculator;

public interface Operation<T> {

    T calculate(T first, T second);

    static <T> void printResult(Operation<T> operation, T a, T b) {
        System.out.println("result of " + operation + " is " + operation.calculate(a, b));
    }

}
