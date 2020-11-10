package Java8.JavaFunctionalInterface.Function05_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate04_negate {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        //------------------------------------------------------
        List<String> collect1 = list.stream()
                .filter(x -> !x.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(collect1);   // [B, BB, BBB]

        //------------------------------------------------------
        // filter() accepts predicate as argument.
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> collect = list.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println(collect);    // [B, BB, BBB]

    }

}
