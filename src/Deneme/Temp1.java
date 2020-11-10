package Deneme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Temp1 {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------");
        Consumer<String> consumer = s -> System.out.println(s.length());
        Student1 st = new Student1("Ali", 21);
        List list = new ArrayList();
        list.add(1);
        list.add(2.03);
        list.add(true);
        list.add("String");
        list.add(st);

        list.stream()
                .map(s -> String.valueOf(s))
                .forEach(consumer);
    }
}

class Student1{
    String name;
    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
