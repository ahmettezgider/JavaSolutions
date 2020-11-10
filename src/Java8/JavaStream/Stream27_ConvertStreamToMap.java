package Java8.JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream27_ConvertStreamToMap {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "A", "A", 100),
                new Employee(2, "A", "A", 200),
                new Employee(3, "B", "B", 300),
                new Employee(4, "B", "B",400),
                new Employee(5, "C", "C", 500),
                new Employee(6, "C", "C",600)));


        // Stream Elements with unique map keys – Collectors.toMap()
        //  Unique map keys
        Map<Long, Employee> employeesMap1= employeeList.stream()
                .collect( Collectors.toMap(Employee::getId,
                        Function.identity()) );

        System.out.println(employeesMap1);

        //-----------------------------------------------------------
        // Stream Elements with duplicate map keys – Collectors.groupingBy()
        // Duplicate map keys

        Map<String, List<Employee>> employeesMap2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        System.out.println(employeesMap2);
    }
}
