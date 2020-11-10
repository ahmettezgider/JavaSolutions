package Java8.JavaStreamOperators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Stream14_min {
    public static void main(String[] args) {
        /*
        1. Stream.min() method
        Method Syntax
        Optional<T> min(Comparator<? super T> comparator)
        This is a terminal operation. So stream cannot be used after this method is executed.
        Returns the minimum/smallest element of this stream according to the provided Comparator.
        This is a special case of a stream reduction.
        The method argument shall be a non-interfering, stateless Comparator.
        The method returns an Optional describing the smallest element of this stream,
        or an empty Optional if the stream is empty.
        It may throw NullPointerException if the smallest element is null.
         */


        //--------------------------------------------------------------
        //Smallest element in stream with lambda expression
        List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        Optional<Integer> minNumber1 = list1.stream()
                .min((i, j) -> i.compareTo(j));

        System.out.println(minNumber1.get());


        //--------------------------------------------------------------
        //Smallest element in stream with comparator
        List<Integer> list2 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        Comparator<Integer> minComparator2 = new Comparator<Integer>() {

            @Override
            public int compare(Integer n1, Integer n2) {
                return n1.compareTo(n2);
            }
        };

        Optional<Integer> minNumber = list2.stream()
                .min(minComparator2);

        System.out.println(minNumber.get());


    }
}
