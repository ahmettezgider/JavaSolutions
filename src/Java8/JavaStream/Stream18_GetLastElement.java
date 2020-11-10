package Java8.JavaStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream18_GetLastElement {

    public static void main(String[] args) {

        // Get last element using reduce() method
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .stream();

        Integer lastElement = stream.reduce((first, second) -> second)
                .orElse(-1);

        System.out.println(lastElement);


        //-------------------------------------------------------------
        // Stream is empty
        Stream<Integer> emptyStream1 = Stream.empty();

        Integer lastElement1 = emptyStream1.reduce((first, second) -> second)
                .orElse(-1);

        System.out.println(lastElement);    //-1

        //or

        Stream<Integer> emptyStream2 = Stream.empty();

        Integer lastElement2 = emptyStream2.reduce((first, second) -> second)
                .orElseThrow(() -> new IllegalStateException("no last element"));

    }
}
