package Java8.JavaStreamOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream02_map {
    public static void main(String[] args) {

        /*
        Stream.map() method
        1.1. Description
        It is an intermediate operation and return another stream as method output return value.
        Returns a stream consisting of the results of applying the given function to the elements of this stream.
        The map operation takes a Function, which is called for each value in the input
        stream and produces one result value, which is sent to the output stream.
        The function used for transformation in map() is a stateless function and returns only a single value.
        map() method is used when we want to convert a stream of X to stream of Y.
        Each mapped stream is closed after its contents have been placed into new output stream.
        map() operation does not flatten the stream as flatMap() operation does.
        1.2. Syntax
        Stream map() method has following syntax.

        map() method syntax
        <R> Stream<R> map(Function<? super T,? extends R> mapper)
         */
        //--------------------------------------------------------------
        //Stream of strings to Stream of Integers
        List<String> listOfStrings1 = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> listOfIntegers1 = listOfStrings1.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(listOfIntegers1);        //[1, 2, 3, 4, 5]



        //--------------------------------------------------------------
        //Stream of employees to stream of distinct salaries
        List<Employee> employeesList = Arrays.asList(
                new Employee(1, "Alex", "",100),
                new Employee(2, "Brian", "",100),
                new Employee(3, "Charles", "",200),
                new Employee(4, "David", "",200),
                new Employee(5, "Edward", "",300),
                new Employee(6, "Frank", "",300)
        );

        List<Double> distinctSalaries = employeesList.stream()
                .map( e -> e.getSalary() )
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctSalaries);


        List<String> alpha = Arrays.asList("a", "b", "c", "d");



        //--------------------------------------------------------------
        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]

        //--------------------------------------------------------------
        // Java 8
        List<String> collect = alpha
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]

        //--------------------------------------------------------------
        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num
                .stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]
    }
}
