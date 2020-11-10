package Java8.JavaCollectors;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// Java Collectors Example – Getting the average age of students using averagingInt() method
public class Collectors14 {
    public static void main(String[] args) {

        List<Student> studentlist = new ArrayList<Student>();
        //Adding Students
        studentlist.add(new Student(11,"Jon",22));
        studentlist.add(new Student(22,"Steve",18));
        studentlist.add(new Student(33,"Lucy",22));
        studentlist.add(new Student(44,"Sansa",23));
        studentlist.add(new Student(55,"Maggie",18));

        //Getting the average Age
        Double avgAge = studentlist.stream()
                .collect(Collectors.averagingInt(s->s.age));

        System.out.println("Average Age of Students is: " + avgAge);
    }
}
