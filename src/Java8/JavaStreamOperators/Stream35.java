package Java8.JavaStreamOperators;

import java.util.*;
import java.util.stream.Collectors;

public class Stream35 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "a4", "b1", "b2", "c1", "c3", "c2");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        List<String> items1 = new ArrayList<>();
        items1.add("Mohammed");
        items1.add("Yuri");
        items1.add("Cha");
        items1.add("Doe");


        items1.forEach(n -> System.out.println(n));

        //--------------------------------------------------------------
        //
        List<String> studentName = Arrays.asList("hector", "hana", "stone");
        List<String> result = studentName.stream()	// Convert list to stream
                .filter(name -> !"hana".equals(name))	// remove "hana" hana from list
                .collect(Collectors.toList());			// collect the output and convert Stream to List

        result.forEach(System.out::println);


        //--------------------------------------------------------------
        //
        String[] myArray = { "this", "is", "a", "sentence" };
        String result1 = Arrays.stream(myArray)
                .reduce("", (a,b) -> a + b);

        List<Integer> list2 = Arrays.asList(2, 3, 4);
        // Here result will be 2*2 + 2*3 + 2*4 that is 18.
        int res = list2.parallelStream().reduce(2, (s1, s2) -> s1 * s2, (p, q) -> p + q);
        System.out.println(res);
    }
}
