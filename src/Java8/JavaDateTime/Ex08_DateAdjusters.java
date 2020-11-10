package Java8.JavaDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Ex08_DateAdjusters {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2013, Month.MAY, 15);                     //Today

        LocalDate endOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(endOfMonth.toString());                              //2013-05-31

        LocalDate nextTue = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(nextTue.toString());                                 //2013-05-21

    }
}

/*
Date adjusters
Date adjusters are another beautiful and useful addition in date handling tools.
It easily solves the problems like : How do you find last day of the month?
Or the next working day? Or a week on Tuesday?
 */