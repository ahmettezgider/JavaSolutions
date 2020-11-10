package Java8.JavaDateTime;

import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZoneOffset;

public class Ex09_CreatingDateObjects {
    public static void main(String[] args) {
        //Builder pattern used to make date object
        OffsetDateTime date1 = Year.of(2013)
                .atMonth(Month.MAY).atDay(15)
                .atTime(0, 0)
                .atOffset(ZoneOffset.of("+03:00"));
        System.out.println(date1);                                     //2013-05-15T00:00+03:00

        //factory method used to make date object
        OffsetDateTime date2 = OffsetDateTime.
                of(2013, 5, 15,
                        0, 0, 0, 0,
                        ZoneOffset.of("+03:00"));
        System.out.println(date2);                                      //2013-05-15T00:00+03:00

    }
}

/*
Creating date objects
Creating date objects now can be done using builder pattern also.
The builder pattern allows the object you want to be built up using individual parts.
This is achieved using the methods prefixed by “at”.

 */