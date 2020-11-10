package Java8.JavaStreamOperators;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
Java Stream dropWhile() Method
Stream dropWhile method returns result on the basis of order of stream elements.

Ordered stream: It returns a stream that contains elements after dropping the elements
that match the given predicate.

Unordered stream: It returns a stream that contains remaining elements of this stream
after dropping a subset of elements that match the given predicate.
 */


public class Stream22_dropWhile {
    public static void main(String[] args) {

        //--------------------------------------------------------------------
        //
        List<Integer> list
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);   // [3, 4, 5, 6, 7, 8, 9, 10]


    }
}
