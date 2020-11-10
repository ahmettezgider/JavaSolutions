package Java8.JavaStreamOperators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03_flatMap {
    public static void main(String[] args) {
        /*
        Learn to use Stream flatMap() method which is used to flatten a stream of collections
        to a stream of elements combined from all collections.

        The flatMap() operation has the effect of applying a one-to-many transformation
        to the elements of the stream, and then flattening the resulting elements into a new stream.

        Stream.flatMap() helps in converting Collection<Collection<T>> to Collection<T>.
        flatMap() = map() + Flattening

        1. What is flattening
        Flattening is referred by converting several lists of lists, and merge all those
        lists to create single list containing all the elements from all the lists.

        Flattening example
        Before flattening   : [[1, 2, 3], [4, 5], [6, 7, 8]]
        After flattening    : [1, 2, 3, 4, 5, 6, 7, 8]

        flatMap() method syntax
        <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)

        2.2. Description
        It is an intermediate operation and return another stream as method output return value.
        Returns a stream consisting of the results of replacing each element of the given stream
        with the contents of a mapped stream produced by applying the provided mapping function to each element.
        The function used for transformation in flatMap() is a stateless function and returns
        only a stream of new values.
        Each mapped stream is closed after its contents have been placed into new stream.
        flatMap() operation flattens the stream; opposite to map() operation which does not apply flattening.
         */

        //--------------------------------------------------------------
        //Convert list of lists to single list
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(listOfAllIntegers);      // [1, 2, 3, 4, 5, 6, 7, 8, 9]



        //--------------------------------------------------------------
        //Convert array of arrays to single list
        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

        List<String> listOfAllChars = Arrays.stream(dataArray)
                .flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());

        System.out.println(listOfAllChars);     // [a, b, c, d, e, f, g, h]


    }
}
