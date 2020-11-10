package Java8.JavaStreamOperators;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream31 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(){
            {
                for (int i = 0; i < 6 ; i++)  add((int)(Math.random()*10));
            }
        };

        System.out.println("list : " + list);

        //--------------------------------------------------------------
        //  map
        list.stream()
                .map(i -> i + (int)(Math.random()*5))
                .collect(Collectors.toList()).forEach(System.out::print);

        System.out.println();

        //--------------------------------------------------------------
        //  filter, sorted, forEach
        list.stream()
                .parallel()
                .filter(i -> i % 2 == 1)
                .sorted()
                .forEach(i -> System.out.print(i + " "));

        System.out.println();

        //--------------------------------------------------------------
        //  filter, min
        int min = list
                .stream()
                .filter(i -> i % 2 == 1)
                .min(Comparator.naturalOrder()).get();
        System.out.println(min);

        //--------------------------------------------------------------
        //  filter, max
        int max = list
                .stream()
                .filter(i -> i % 2 == 1)
                .max(Comparator.naturalOrder()).get();
        System.out.println(max);

        //--------------------------------------------------------------
        //  reduce
        int sum = list
                .stream()
                .reduce(0, (x,y) -> x+y);
        System.out.println(sum);

        //--------------------------------------------------------------
        //  reduce
        int sum1 = list
                .stream()
                .reduce(0, Integer::sum);
        System.out.println(sum1);

        //--------------------------------------------------------------
        //  map, collect
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number
                .stream()
                .map(x -> x*x)
                .collect(Collectors.toList());
        System.out.println(square);

        //--------------------------------------------------------------
        //  filter, collect
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names
                .stream()
                .filter(s->s.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(result);

        //--------------------------------------------------------------
        //  sorted, collect
        List<String> show = names
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(show);

        //--------------------------------------------------------------
        //  map, collect
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
        Set<Integer> squareSet = numbers
                .stream()
                .map(x->x*x)
                .collect(Collectors.toSet());
        System.out.println(squareSet);

        //--------------------------------------------------------------
        //  map, forEach
        number
                .stream()
                .map(x->x*x)
                .forEach(y->System.out.println(y));

        //--------------------------------------------------------------
        //  filter, reduce
        int even = number
                .stream()
                .filter(x->x%2==0)
                .reduce(0,(ans,i)-> ans+i);

        System.out.println(even);


        //--------------------------------------------------------------
        //  map, filter, collect
        List<Integer> even1 = numbers
                .stream()
                .map(s -> Integer.valueOf(s))
                .filter(number1 -> number1 % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("processed list, only even numbers: " + even);
    }
}
