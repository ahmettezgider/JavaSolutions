package Java8.JavaStream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

public class Stream33_StreamConcat {
    public static void main(String[] args) {
        //--------------------------------------------------------------------
        //Merge two streams
        Stream<Integer> firstStream1 = Stream.of(1, 2, 3);
        Stream<Integer> secondStream1 = Stream.of(4, 5, 6);

        Stream<Integer> resultingStream1 = concat(firstStream1, secondStream1);

        System.out.println( resultingStream1.collect(Collectors.toList()) ); // [1, 2, 3, 4, 5, 6]


        //--------------------------------------------------------------------
        //Merge multiple streams
        Stream<Integer> first = Stream.of(1, 2);
        Stream<Integer> second = Stream.of(3,4);
        Stream<Integer> third = Stream.of(5, 6);
        Stream<Integer> fourth = Stream.of(7,8);

        Stream<Integer> resultingStream = concat(first, concat(second, concat(third, fourth)));

        System.out.println( resultingStream.collect(Collectors.toList()) );    // [1, 2, 3, 4, 5, 6, 7, 8]


        //--------------------------------------------------------------------
        //Java merge streams and retain unique elements
        //Numbers and strings
        Stream<Integer> firstStream2 = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> secondStream2 = Stream.of(4, 5, 6, 7, 8, 9);

        Stream<Integer> resultingStream2 = Stream.concat(firstStream2, secondStream2)
                .distinct();

        System.out.println( resultingStream2.collect(Collectors.toList()) ); // [1, 2, 3, 4, 5, 6, 7, 8, 9]


    }
}
