package Java8.JavaStreamOperators;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream34 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) {
                    add((int) (Math.random() * 10));
                }
            }
        };

        System.out.println("list : " + list);

        //--------------------------------------------------------------
        //
        Integer[] nums1 = list.stream()
                .filter(n -> n % 2 == 1)
                .toArray(Integer[]::new);

        //--------------------------------------------------------------
        //
        list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList())
                .forEach(n->System.out.print(n + " "));
        System.out.println();

        //--------------------------------------------------------------
        //
        int[] nums2 = {1, 2, 3, 4, 5};
        Integer[] result2 = Arrays.stream(nums2)
                .map(x -> x * 2)
                .boxed()
                .toArray(Integer[]::new);

        //--------------------------------------------------------------
        //
        String str = "$13 $15 $20";
        Integer[] nums = Arrays.stream(str.replace("$", "").split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);


        //--------------------------------------------------------------
        //
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());


        //--------------------------------------------------------------
        //
        List<Integer> result = list.stream()
                .map(n -> {
                    if (asalMi(n))
                        return n;
                    else
                        return 0;
                }).collect(Collectors.toList());

        System.out.println(result);

        //--------------------------------------------------------------
        // map() icerisine direct method yazma
        // var local variablelar icin kullanilir ve initialize edilmek zorundadir. java 10 ile geldi
        var result1 = list.stream()
                .map(num -> {
                    if (num < 2) return 0;
                    else if (num == 2) return 2;
                    else for (int i=2; i<num/2; i++) if (num % i == 0) return 0;
                    return num;
                }).collect(Collectors.toList());

        System.out.println(result1);

        //--------------------------------------------------------------
        //  numbers larda boxed() yaparak collect edebiliyoruz. Stream.generate() kullanimi
        var result3 = Stream
                .generate(new Random()::nextDouble)
                .map(e -> (e * 100))
                .mapToInt(Double::intValue)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(result3);
    }


    // asalMi method
    public static boolean asalMi(long num){
        if (num < 2) return false;
        else if (num == 2) return true;
        else
            for (int i=2; i<num/2; i++)
                if (num % i == 0) return false;
        return true;
    }
}
