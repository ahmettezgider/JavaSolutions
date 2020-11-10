package Java8.JavaDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex08_DayOfWeek {
    public static void main(String[] args) {
        //day-of-week to represent, from 1 (Monday) to 7 (Sunday)
        System.out.println(DayOfWeek.of(2));                    //TUESDAY

        DayOfWeek day = DayOfWeek.FRIDAY;
        System.out.println(day.getValue());                     //5

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.with(DayOfWeek.MONDAY));  //2013-05-13  i.e. when was monday in current week ?

    }
}
