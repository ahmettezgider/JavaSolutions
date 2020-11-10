package Java8.JavaDateTime;

import java.time.LocalTime;

public class Ex02_LocalTime {
    public static void main(String[] args) {
        //LocalTime localTime = LocalTime.now();     //toString() in format 09:57:59.744
        LocalTime localTime = LocalTime.of(12, 20);
        System.out.println(localTime.toString());    //12:20
        System.out.println(localTime.getHour());     //12
        System.out.println(localTime.getMinute());   //20
        System.out.println(localTime.getSecond());   //0
        System.out.println(localTime.MIDNIGHT);      //00:00
        System.out.println(localTime.NOON);          //12:00
    }
}

/*
LocalTime
The LocalTime class represents a time. There is no representation of a date or time-zone.
 */