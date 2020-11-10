package Java8.JavaFunctionalInterface;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionDefinitions {
    public static void main(String[] args) {

        Stream.iterate(1, x->x+x)
                .limit(10)
                .forEach(System.out::println);

        ArrayList<Integer> list = (ArrayList<Integer>) Stream.of(1,2,3,4,5).collect(Collectors.toList());

        list.stream()
                .map(x -> x * x)
                .filter(x -> x%2==0)
                .forEach(x -> System.out.print(x + " - "));
    }
}
