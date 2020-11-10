package Java8.JavaLambda;

// Java Lambda Expression Example: Foreach Loop

import java.util.*;
public class Lambda7{
    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (n)->System.out.println(n)
        );
    }
}
