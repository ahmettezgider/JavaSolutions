package Java8.JavaFunctionalInterface.Function04_UnaryOperator;

public class UnaryOperator01_Explanation {
    public static void main(String[] args) {
        /*

            In Java 8, UnaryOperator is a functional interface and it extends Function.

            The UnaryOperator
            takes one argument, and returns a result of the same type of its arguments.

            UnaryOperator.java
            @FunctionalInterface
            public interface UnaryOperator<T> extends Function<T, T> {
            }

            The Function takes one argument of any type and returns a result of any type.

            Function.java
            @FunctionalInterface
            public interface Function<T, R> {
                R apply(T t);
            }

         */


    }
}
