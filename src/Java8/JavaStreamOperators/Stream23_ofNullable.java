package Java8.JavaStreamOperators;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Java 9 Stream ofNullable Method
Stream ofNullable method returns a sequential stream that contains a single element,
if non-null. Otherwise, it returns an empty stream.

It helps to handle null stream and NullPointerException.
 */

public class Stream23_ofNullable {

    public static void main(String[] args) {

        //--------------------------------------------------------------------
        //Stream can have null values also.
        List<Integer> list
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());

        System.out.println(list);   // [3, 4, 5, 6, 7, 8, 9, 10]

        //--------------------------------------------------------------------
        //This program will not produce any output
        Stream<Integer> val
                = Stream.ofNullable(null);
        val.forEach(System.out::println);
    }
}
