package Java8.JavaDateTime;

import java.time.LocalDateTime;

public class Ex03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toString());      //2013-05-15T10:01:14.911
        System.out.println(localDateTime.getDayOfMonth()); //15
        System.out.println(localDateTime.getHour());       //10
        System.out.println(localDateTime.getNano());       //911000000

    }
}

/*
LocalDateTime
The LocalDateTime class represents a date-time. There is no representation of a time-zone.
 */