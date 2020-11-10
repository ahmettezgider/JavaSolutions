package Java8.JavaStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream11_Iterate {
    public static void main(String[] args) {

        List<Integer> ints = IntStream.iterate(0, i -> i + 2)
                .mapToObj(Integer::valueOf)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(ints);
    }
}
