package Java8.JavaStreamOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream13_toArray {
    public static void main(String[] args) {

        //--------------------------------------------------------------
        //Convert stream of strings to array
        Stream<String> tokenStream1 = Arrays.asList("A", "B", "C", "D").stream();  //stream

        String[] tokenArray1 = tokenStream1.toArray(String[]::new);   //array

        System.out.println(Arrays.toString(tokenArray1));   // [A, B, C, D]

        //--------------------------------------------------------------
        //Convert infinite stream to array
        //Infinite stream to array to ints
        IntStream infiniteNumberStream1 = IntStream.iterate(1, i -> i+1);

        int[] intArray1 = infiniteNumberStream1.limit(10)
                .toArray();

        System.out.println(Arrays.toString(intArray1));      //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //--------------------------------------------------------------
        //Infinite stream to array to Integers – Boxed stream
        IntStream infiniteNumberStream2 = IntStream.iterate(1, i -> i+1);

        Integer[] integerArray2 = infiniteNumberStream2.limit(10)
                .boxed()
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(integerArray2));     // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //--------------------------------------------------------------
        //Filter stream and collect elements to array
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "A", "A",100),
                new Employee(2, "B", "B", 200),
                new Employee(3, "C", "C", 300),
                new Employee(4, "D", "D", 400),
                new Employee(5, "E", "E", 500),
                new Employee(6, "F", "F",600)));

        Employee[] employeesArray3 = employeeList.stream()
                .filter(e -> e.getSalary() < 400)
                .toArray(Employee[]::new);

        System.out.println(Arrays.toString(employeesArray3));

    }
}
