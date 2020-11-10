package Java8.JavaStream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream29_ConvertStreamToList {
    public static void main(String[] args) {

        //Convert stream of strings to ArrayList
        Stream<String> tokenStream1 = Stream.of("A", "B", "C", "D");   //stream

        List<String> tokenlist1 = tokenStream1.collect(Collectors.toList());    //list

        System.out.println(tokenlist1);  // [A, B, C, D]


        //--------------------------------------------------------------------
        // Convert stream of strings to LinkedList
        Stream<String> tokenStream2 = Arrays.asList("A", "B", "C", "D").stream();  //stream

        List<String> tokenlist2 = tokenStream2.collect(Collectors.toCollection(LinkedList::new));   //list

        System.out.println(tokenlist2); // [A, B, C, D]

        //--------------------------------------------------------------------
        //Convert stream to list for filtered elements
        Stream<Employee> employeeStream = Stream.of(
                new Employee(1, "A", "A",100),
                new Employee(2, "B", "B",200),
                new Employee(3, "C", "C", 300),
                new Employee(4, "D", "D", 400),
                new Employee(5, "E", "E", 500),
                new Employee(6, "F", "F",600));

        List<Employee> employeeList = employeeStream
                .filter(e -> e.getSalary() < 400)
                .collect(Collectors.toList());

        employeeList.forEach(System.out::println);

        //--------------------------------------------------------------------
        //Convert infinite stream to list
        IntStream infiniteNumberStream = IntStream.iterate(1, i -> i+1);

        List<Integer> integerlist = infiniteNumberStream.limit(10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(integerlist);



    }
}


