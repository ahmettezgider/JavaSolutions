package Java8.JavaStreamOperators;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Java Stream takeWhile() Method
Stream takeWhile method takes each element that matches its predicate.
It stops when it get unmatched element.
It returns a subset of elements that contains all matched elements, other part of stream is discarded.
 */

public class Stream21_takeWhile {
    public static void main(String[] args) {

        //--------------------------------------------------------------------
        //This example returns an empty list because it fails at first list element,
        // and takewhile stops here.
        List<Integer> list1
                = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list1);



        //--------------------------------------------------------------------
        //we are getting first two elements because these are even and stops at third element.
        List<Integer> list2
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list2);
    }
}
