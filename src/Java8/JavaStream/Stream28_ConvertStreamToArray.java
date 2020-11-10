package Java8.JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream28_ConvertStreamToArray {
    public static void main(String[] args) {

        // Convert stream of strings to array
        //Convert stream of strings to array
        Stream<String> tokenStream = Arrays.asList("A", "B", "C", "D").stream();  //stream

        String[] tokenArray = tokenStream.toArray(String[]::new);   //array

        System.out.println(Arrays.toString(tokenArray));

        //-------------------------------------------------------------------
        // Convert infinite stream to array
        // Infinite stream to array to ints
        IntStream infiniteNumberStream1 = IntStream.iterate(1, i -> i+1);

        int[] intArray = infiniteNumberStream1.limit(10)
                .toArray();

        System.out.println(Arrays.toString(intArray));      // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //-------------------------------------------------------------
        //Infinite stream to array to Integers – Boxed stream
        IntStream infiniteNumberStream2 = IntStream.iterate(1, i -> i+1);

        Integer[] integerArray = infiniteNumberStream2.limit(10)
                .boxed()
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(integerArray));  //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //--------------------------------------------------------------
        //Filter stream and collect elements to array
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "A", "A",100),
                new Employee(2, "B", "B",200),
                new Employee(3, "C", "C",300),
                new Employee(4, "D", "D",400),
                new Employee(5, "E", "E",500),
                new Employee(6, "F", "F", 600)));

        Employee[] employeesArray = employeeList.stream()
                .filter(e -> e.getSalary() < 400)
                .toArray(Employee[]::new);

        System.out.println(Arrays.toString(employeesArray));


    }
}
