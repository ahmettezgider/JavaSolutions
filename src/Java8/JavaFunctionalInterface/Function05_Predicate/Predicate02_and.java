package Java8.JavaFunctionalInterface.Function05_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate02_and {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //------------------------------------------------------
        // multiple filters
        List<Integer> collect1 = list.stream()
                .filter(x -> x > 5 && x < 8)
                .collect(Collectors.toList());

        System.out.println(collect1);   // [6, 7]

        //------------------------------------------------------
        // Replace with Predicate.and()
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;

        List<Integer> collect2 = list.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .collect(Collectors.toList());

        System.out.println(collect2);   // [6, 7]
    }
}
