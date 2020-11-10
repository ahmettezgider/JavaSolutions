package Java8.JavaFunctionalInterface.Function03_BinaryOperator;

public class BinaryOperator01_Explanation {
    public static void main(String[] args) {
        /*

            In Java 8, BinaryOperator is a functional interface and it extends BiFunction.

            The BinaryOperator takes two arguments of the same type and returns a result
            of the same type of its arguments.

            BinaryOperator.java
            @FunctionalInterface
            public interface BinaryOperator<T> extends BiFunction<T,T,T> {
            }

            The BiFunction takes two arguments of any type, and returns a result of any type.

            BiFunction.java
            @FunctionalInterface
            public interface BiFunction<T, U, R> {
                  R apply(T t, U u);
            }

         */


    }
}
