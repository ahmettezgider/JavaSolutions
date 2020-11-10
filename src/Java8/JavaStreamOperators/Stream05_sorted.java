package Java8.JavaStreamOperators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream05_sorted {
    public static void main(String[] args) {
        /*
        1. Stream sort methods
        Stream interface provides two methods for sorting the stream elements.

        1.1. Stream.sorted()
        Syntax
        Stream<T> sorted()
        This is a stateful intermediate operation which returns a new stream.
        Returns a stream consisting of the elements of this stream, sorted according to natural order.
        If the elements of this stream are not Comparable, a java.lang.ClassCastException may be
        thrown when the terminal operation is executed.
        For ordered streams, the sort is stable.
        For unordered streams, no stability guarantees are made.
        1.2. Stream.sorted(Comparator comparator)
        Syntax
        Stream<T> sorted(Comparator<? super T> comparator)
         */

        //--------------------------------------------------------------
        //Sort stream elements in natural order
        List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        List<Integer> sortedList1 = list1.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList1);     // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        //--------------------------------------------------------------
        //Sort stream elements using comparator
        List<Integer> list2 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        List<Integer> sortedList2 = list2.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sortedList2);    // [9, 8, 7, 6, 5, 4, 3, 2, 1]

        //--------------------------------------------------------------
        //Sort stream elements using custom comparator
        List<Integer> list3 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        };

        List<Integer> sortedList3 = list3.stream()
                .sorted(reverseComparator)
                .collect(Collectors.toList());

        System.out.println(sortedList3); // [9, 8, 7, 6, 5, 4, 3, 2, 1]

        //--------------------------------------------------------------
        //Sort stream elements using lambda expression
        List<Integer> list4 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        List<Integer> sortedList4 = list4.stream()
                .sorted( (i1, i2) -> i2.compareTo(i1) )
                .collect(Collectors.toList());

        System.out.println(sortedList4);
    }
}
