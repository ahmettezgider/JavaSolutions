package Java8.JavaStreamOperators;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream20_toMap {
    public static void main(String[] args) {

        //--------------------------------------------------------------
        //  toMap
        String str = "Lorem adipising ipsum dolor sit Lorem amet Consectetur adipising elit Lorem ipsum dolor";

        List<String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toList());

        Map<String, Integer > wordCounter = list.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

        System.out.println(wordCounter);


        //--------------------------------------------------------------
        //  toMap

        ArrayList<Integer> list1 = new ArrayList<>(){
            {
                for (int i = 0; i < 10 ; i++)  add((int)(Math.random()*10));
            }
        };

        System.out.println(list1);
        Map<Integer, Integer > tekrarMap = list1.stream()
                .collect(Collectors.toMap(w -> w, w -> 1, Integer::sum));

        System.out.println(tekrarMap);
        Collections.sort(list1);



        //--------------------------------------------------------------
        //  toMap
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "A", "A", 100),
                new Employee(2, "A", "A", 200),
                new Employee(3, "B", "B", 300),
                new Employee(4, "B", "B", 400),
                new Employee(5, "C", "C", 500),
                new Employee(6, "C", "C", 600)));

        Map<Long, Employee> employeesMap = employeeList.stream()
                .collect( Collectors.toMap(Employee::getId,
                        Function.identity()) );

        System.out.println(employeesMap);
    }
}
