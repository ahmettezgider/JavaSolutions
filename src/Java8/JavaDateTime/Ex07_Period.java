package Java8.JavaDateTime;

import java.time.LocalDate;
import java.time.Period;

public class Ex07_Period {
    public static void main(String[] args) {
        Period period = Period.ofDays(6);
        System.out.println(period.toString());    //P6D

        period = Period.ofMonths(6);
        System.out.println(period.toString());    //P6M

        period = Period.between(LocalDate.now(), LocalDate.now().plusDays(60));
        System.out.println(period.toString());   //P1M29D
    }
}

/*
Period
To interact with human, you need to get bigger durations which are presented with Period class.
 */