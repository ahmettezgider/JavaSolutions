package Java8.JavaStreamOperators;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream08_skip {
    public static void main(String[] args) {

        /*
        1. Syntax
        Method syntax
        Stream<T> skip(long n)
        Here n is the number of leading elements to skip; and method return value is a new stream
        consist of elements picked from original stream.

        The method may throw IllegalArgumentException if n is negative.

        2. Description
        Stream.skip() method is stateful intermediate operation. Stateful operations,
        such as distinct and sorted, may incorporate state from previously seen elements
        when processing new elements.
        Returns a stream consisting of the remaining elements of the stream after discarding
        the first n elements of the stream.
        If the stream contains fewer than n elements then an empty stream will be returned.
        Generally skip() is a cheap operation, it can be quite expensive on ordered parallel pipelines,
        especially for large values of n.
        Using an unordered stream source (such as generate(Supplier)) or removing the ordering
        constraint with BaseStream.unordered() may result in significant speedups of skip() in parallel pipelines.
        skip() skips the first n elements in the encounter order.
         */


        //--------------------------------------------------------------
        //Stream skip() example
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);

        List<Integer> newList = evenNumInfiniteStream
                .skip(5)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(newList);

    }
}
