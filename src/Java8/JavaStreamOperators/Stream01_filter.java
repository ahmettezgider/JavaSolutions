package Java8.JavaStreamOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream01_filter {
    public static void main(String[] args) {

        /*
        1. Stream filter() method
        This is a intermediate operation.
        Returns a stream consisting of the elements of this stream that match the given predicate.
        The filter() argument shall be stateless predicate to apply to each element to determine
        if it should be included.
        Predicate is a functional interface. So, we can also pass lambda expression also.
        It returns a new stream so we can use other operations applicable to any stream.

        Stream<T> filter(Predicate<? super T> condition)
         */

        //--------------------------------------------------------------
        //Find all even numbers – Lambda expression
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list1.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


        //--------------------------------------------------------------
        //Find all even numbers – Predicate class
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> condition2 = new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer n) {
                if (n % 2 == 0) {
                    return true;
                }
                return false;
            }
        };

        list2.stream().filter(condition2).forEach(System.out::println);


        //--------------------------------------------------------------
        //Filter even numbers and collect into new list
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers3 = list3.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers3);


        //--------------------------------------------------------------
        //Filter even numbers and get squares
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers4 = list4.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(evenNumbers4);



        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"A","A",25000f));
        employeeList.add(new Employee(2,"B","B",30000f));
        employeeList.add(new Employee(3,"C","C",28000f));
        employeeList.add(new Employee(4,"D","D",28000f));
        employeeList.add(new Employee(5,"E","E",90000f));
        employeeList.stream()
                .filter(p ->p.getSalary()> 30000)   // filtering salary
                .map(pm ->pm.getSalary())           // fetching salary
                .forEach(System.out::println);      // iterating salary
    }
}
