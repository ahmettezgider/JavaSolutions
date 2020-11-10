package Java8.JavaForEach;

import java.util.Arrays;
import java.util.List;

public class ForEach01 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alex", "Brian", "Charles");

        names.forEach(System.out::println);

    }
}
