package Java8.JavaStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream04_charsOrTokens {

    public static void main(String[] args) {

        // String chars or String tokens
        IntStream stream1 = "12345_abcdefg".chars();
        stream1.forEach(p -> System.out.println(p));

        //OR

        Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
        stream2.forEach(p -> System.out.println(p));

    }

}
