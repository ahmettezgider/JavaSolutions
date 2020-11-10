package Java8.JavaStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream19_FindRemoveDuplicatesFromList {

    public static void main(String[] args) {

        //Stream.distinct() example
        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList1
                = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        List<Integer> listWithoutDuplicates = numbersList1.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(listWithoutDuplicates);

        //-----------------------------------------------------------------
        // Collectors.toSet() to remove duplicates
        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList2
                = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        Set<Integer> setWithoutDuplicates = numbersList2.stream().collect(Collectors.toSet());

        System.out.println(setWithoutDuplicates);

        //--------------------------------------------------------------------
        // Collectors.toMap() to count occurances
        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList3
                = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        Map<Integer, Long> elementCountMap = numbersList3.stream()
                .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));

        System.out.println(elementCountMap);





    }
}
