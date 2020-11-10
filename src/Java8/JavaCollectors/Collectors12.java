package Java8.JavaCollectors;

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;


// Stream Collectors example of fetching data as List
public class Collectors12 {
    public static void main(String[] args) {
        List<Student> studentlist = new ArrayList<Student>();
        //Adding Students
        studentlist.add(new Student(11,"Jon",22));
        studentlist.add(new Student(22,"Steve",18));
        studentlist.add(new Student(33,"Lucy",22));
        studentlist.add(new Student(44,"Sansa",23));
        studentlist.add(new Student(55,"Maggie",18));

        //Fetching student names as List
        List<String> names = studentlist.stream()
                .map(n->n.name)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
