package Java8.JavaStreamOperators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream11_forEach {
    public static void main(String[] args) {
        /*
        1. Stream.forEach() method
        This is a terminal operation.
        After forEach() is performed, the stream pipeline is considered consumed, and can no longer be used.
        If we need to traverse the same data source again, we must return to the data source to get a new stream.
        For parallel stream pipelines, forEach() operation does not guarantee the order of elements
        in the stream, as doing so would sacrifice the benefit of parallelism.
        If the provided action (method argument) accesses shared state between elements,
        it is responsible for providing the required synchronization.
        2. forEach() method syntax
        The method syntax is as follows:

        Syntax
        void forEach(Consumer<? super T> action)
         */


        //--------------------------------------------------------------
        //Traverse and print all elements
        List<Integer> list1 = Arrays.asList(2, 4, 6, 8, 10);

        list1.stream().forEach( System.out::println );


        //--------------------------------------------------------------
        //Traverse and print all elements in reverse order
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        list2.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}
