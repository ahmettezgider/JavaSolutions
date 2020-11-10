package Java8.JavaCollectors;


import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

// Collectors Example – Collecting Data as Set
public class Collectors13 {
    public static void main(String[] args) {
        List<Student> studentlist = new ArrayList<Student>();

        //Adding Students
        studentlist.add(new Student(11,"Jon",22));
        studentlist.add(new Student(22,"Steve",18));
        studentlist.add(new Student(33,"Lucy",22));
        studentlist.add(new Student(44,"Sansa",23));
        studentlist.add(new Student(55,"Maggie",18));

        //Fetching student data as a Set
        Set<Student> students = studentlist.stream()
                .filter(n-> n.id > 22)
                .collect(Collectors.toSet());

        //Iterating Set
        for(Student stu : students) {
            System.out.println(stu.id + " " + stu.name + " " + stu.age);
        }
    }
}

