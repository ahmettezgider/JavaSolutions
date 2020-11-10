package Java8.JavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Stream25_IfElseLogic {
    public static void main(String[] args) {

        //  if-else logic
        ArrayList<Integer> numberList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Consumer<Integer> action = i -> {
            if(i % 2 == 0) {
                System.out.println("Even number :: " + i);
            } else {
                System.out.println("Odd  number :: " + i);
            }
        };

        numberList1.stream().forEach(action);


        // if logic – lambda conditional filter

        ArrayList<Integer> numberList2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        numberList2.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }
}
