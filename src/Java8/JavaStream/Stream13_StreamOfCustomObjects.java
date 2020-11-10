package Java8.JavaStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream13_StreamOfCustomObjects {

    public static void main(String[] args) {

        List<Employee> employees = Stream.generate(Employee::create)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(employees);
    }
}


