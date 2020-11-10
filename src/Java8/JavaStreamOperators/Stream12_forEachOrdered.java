package Java8.JavaStreamOperators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Stream12_forEachOrdered {
    public static void main(String[] args) {
        /*
        1. Stream forEachOrdered() method
        This is a terminal operation.
        After forEachOrdered() is performed, the stream pipeline is considered consumed,
        and can no longer be used.
        If we need to traverse the same data source again, we must return to the data source to get a new stream.
        Performs an action for each element of this stream, in the encounter order of the stream
        if the stream has a defined encounter order.
        Performing the action for one element happens-before performing the action for subsequent elements,
        but for any given element, the action may be performed in whatever thread the library chooses.
        2. forEachOrdered() method syntax
        The method syntax is as follows:

        Syntax
        void forEachOrdered(Consumer<? super T> action)
        Consumer is a functional interface and action represents the a non-interfering action to be
        performed on each element in the stream.

        3. forEach() vs forEachOrdered()
        The behavior of forEach() operation is explicitly non-deterministic. For parallel stream pipelines,
        this operation does not guarantee to respect the encounter order of the stream.

        While the forEachOrdered() operation respects the the encounter order of the stream
        if the stream has a defined encounter order whether it is parallel stream or sequential.
         */


        //--------------------------------------------------------------
        //Stream forEach() vs forEachOrdered()
        List<Integer> list1 = Arrays.asList(2, 4, 6, 8, 10);

        list1.stream().parallel().forEach( System.out::println );        //6 10 8 4 2

        list1.stream().parallel().forEachOrdered( System.out::println ); //2 4 6 8 10


        //--------------------------------------------------------------
        //Traverse and print all elements
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        list2.stream().forEachOrdered( System.out::println );

        //--------------------------------------------------------------
        //Traverse and print all elements in reverse order
        List<Integer> list3 = Arrays.asList(2, 4, 6, 8, 10);

        list3.stream()
                .sorted(Comparator.reverseOrder())
                .forEachOrdered(System.out::println);


    }
}
