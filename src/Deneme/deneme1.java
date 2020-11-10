package Deneme;

import java.util.*;

public class deneme1 {

    public static void main(String[] args) {

        /////////////////////////////////////////////////////////////////////////
        //      List to Array
        var list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        // create a date
        Date date = new Date(97, 1, 23);
        long diff = date.getTime();

        // print how many milliseconds have passed since January 1, 1970, 00:00:00 GMT
        System.out.println("If date is 23-01-1997, " + diff + " have passed.");
    }
}
