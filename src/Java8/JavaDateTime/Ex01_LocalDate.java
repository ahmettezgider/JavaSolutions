package Java8.JavaDateTime;

import java.time.LocalDate;

public class Ex01_LocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());                //2013-05-15
        System.out.println(localDate.getDayOfWeek().toString()); //WEDNESDAY
        System.out.println(localDate.getDayOfMonth());           //15
        System.out.println(localDate.getDayOfYear());            //135
        System.out.println(localDate.isLeapYear());              //false
        System.out.println(localDate.plusDays(12).toString());   //2013-05-27
    }
}
/*
LocalDate
The LocalDate class represents a date. There is no representation of a time or time-zone.
 */
