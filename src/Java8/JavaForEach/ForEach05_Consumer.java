package Java8.JavaForEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach05_Consumer {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> action = System.out::println;

        numberList.stream()
                .filter(n -> n%2  == 0)
                .forEach( action );
    }
}
