package Java8.JavaStreamOperators;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream07_limit {
    public static void main(String[] args) {
        /*
        1. Stream.limit() – Syntax
        Method syntax
        Stream<T> limit(long maxSize)
        Here maxSize the number of elements the stream should be limited to; and method
        return value is a new stream consist of elements picked from original stream.

        2. Stream.limit() – Description
        Stream.limit() method is short-circuiting intermediate operation.
        An intermediate operation is short-circuiting if, when presented with infinite input,
        it may produce a finite stream as a result. Please note that a terminal operation
        is short-circuiting if, when presented with infinite input, it may terminate in finite time.
        It returns a stream consisting of the maximum elements, no longer than given size in length,
        of current stream.
        Generally, limit() is cheap operation but may sometimes be expensive if maxSize has a large value
        and stream is parallely processed.
        Using an unordered stream source (such as generate(Supplier)) or removing the ordering
        constraint with BaseStream.unordered() may result in significant speedups of limit() in
        parallel pipelines.
        limit() returns the first n elements in the encounter order.
         */

        //--------------------------------------------------------------
        //Stream limit() example
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);

        List<Integer> newList = evenNumInfiniteStream.limit(10)
                .collect(Collectors.toList());
        System.out.println(newList);

    }
}
