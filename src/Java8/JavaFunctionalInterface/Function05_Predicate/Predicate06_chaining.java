package Java8.JavaFunctionalInterface.Function05_Predicate;

import java.util.function.Predicate;

public class Predicate06_chaining {

    public static void main(String[] args) {

        Predicate<String> startWithA = x -> x.startsWith("a");

        // start with "a" or "m"
        boolean result = startWithA
                .or(x -> x.startsWith("m"))
                .test("mkyong");
        System.out.println(result);     // true

        // !(start with "a" and length is 3)
        boolean result2 = startWithA
                .and(x -> x.length() == 3)
                .negate()
                .test("abc");
        System.out.println(result2);    // false

    }
}
