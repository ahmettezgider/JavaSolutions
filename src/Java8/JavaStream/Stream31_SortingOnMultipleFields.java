package Java8.JavaStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream31_SortingOnMultipleFields {
    public static void main(String[] args) {

        //--------------------------------------------------------------------
        //Create comparators for multiple fields
        //first name comparator
        Comparator<Employee> compareByFirstName = Comparator.comparing( Employee::getName );

        //last name comparator
        Comparator<Employee> compareByLastName = Comparator.comparing( Employee::getSalary );

        //Compare by first name and then last name (multiple fields)
        Comparator<Employee> compareByFullName = compareByFirstName.thenComparing(compareByLastName);


        //--------------------------------------------------------------------
        //Java stream sort on multiple fields
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add( new Employee(2l, "Lokesh", "Gupta",2500) );
        employees.add( new Employee(1l, "Alex", "Gussin",2500) );
        employees.add( new Employee(4l, "Brian", "Sux",2500) );
        employees.add( new Employee(5l, "Neon", "Piper",2500) );
        employees.add( new Employee(3l, "David", "Beckham",2500) );
        employees.add( new Employee(7l, "Alex", "Beckham",2500) );
        employees.add( new Employee(6l, "Brian", "Suxena",2500) );

        //Compare by first name and then last name
        Comparator<Employee> compareByName = Comparator
                .comparing(Employee::getName)
                .thenComparing(Employee::getSalary);

        List<Employee> sortedEmployees = employees.stream()
                .sorted(compareByName)
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);

        //--------------------------------------------------------------------
        //



    }
}
