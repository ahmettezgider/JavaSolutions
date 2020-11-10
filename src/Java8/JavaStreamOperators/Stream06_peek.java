package Java8.JavaStreamOperators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream06_peek {
    public static void main(String[] args) {
        /*
        1. Stream.peek() – Syntax
        Method syntax
        Stream<T> peek(Consumer<? super T> action)
        Here action is a non-interfering action to perform on the elements as they are consumed
        from the stream. This method returns a new stream consist of elements of the original stream.

        2. Stream.peek() – Description
        Stream.peek() method is an intermediate operation.
        It returns a stream consisting of the elements of current stream.
        It additionally perform the provided action on each element as elements.
        For parallel stream pipelines, the action may be called at whatever time and in whatever
        thread the element is made available by the upstream operation.
        If the action modifies shared state, it is itself responsible for providing the
        required synchronization.
        This method exists mainly to support debugging, where we want to see the elements
        as they flow past a certain point in a pipeline.
         */

        //--------------------------------------------------------------
        //Without terminal operation
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        list1.stream()
                .peek( System.out::println );       //prints nothing


        //--------------------------------------------------------------
        //With terminal operation
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> newList2 = list2.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(newList2);



    }
}
