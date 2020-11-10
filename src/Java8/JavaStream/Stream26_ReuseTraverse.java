package Java8.JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream26_ReuseTraverse {
    public static void main(String[] args) {
        // Can we reuse stream? No.
        // solution --> Only usecase where you might want to create a source and
        // get stream multiple times is – unit testing. In that case,
        // we can always use stream() method or just create a fresh stream.

        List<Integer> tokens = Arrays.asList(1, 2, 3, 4, 5);

        //first use
        Optional<Integer> result = tokens.stream().max(Integer::compareTo);
        System.out.println(result.get());

        //second use
        result = tokens.stream().min(Integer::compareTo);
        System.out.println(result.get());

        //third use
        long count = tokens.stream().count();
        System.out.println(count);
    }
}
