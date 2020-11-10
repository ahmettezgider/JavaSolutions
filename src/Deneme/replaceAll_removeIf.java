package Deneme;

import java.util.ArrayList;
import java.util.Arrays;

public class replaceAll_removeIf {
    public static void main(String[] args) {
        var list = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) add((int) (Math.random() * 10));
            }
        };

        list.forEach(System.out::print);
        System.out.println();

        //----------------------------------------------------------------------
        var listStr = new ArrayList<>(
                Arrays.asList("TürkiyE", "AlmanyA", "AmerikA", "FransA", "IngilterE")
        );


        listStr.replaceAll(s -> s.toUpperCase());

        System.out.println(listStr);

        //----------------------------------------------------------------------
        listStr.replaceAll(s -> {
            String str = "";
            str += s.substring(0,1).toUpperCase();
            str += s.substring(1).toLowerCase();
            return str;
        });
        System.out.println(listStr);

        //----------------------------------------------------------------------
        listStr.removeIf(s -> {
            if (s.contains("l")) return true;
            return false;
        });
        System.out.println(listStr);

        //----------------------------------------------------------------------
        String ss = listStr
                .stream()
                .filter(s -> !s.contains("a"))
                .reduce((a, b) -> a.concat("1").concat(b))
                .toString();
        System.out.println(ss);

    }
}
