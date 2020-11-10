package Java8.JavaFunctionalInterface.Function05_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate03_or {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        //------------------------------------------------------
        // multiple filters
        List<String> collect1 = list.stream()
                .filter(x -> x.length()==3 || x.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(collect1);   // [A, AA, AAA, BBB]

        //------------------------------------------------------
        // Replace with Predicate.or()


        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> collect2 = list.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect2);   // [A, AA, AAA, BBB]

    }
}
