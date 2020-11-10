package Java8.JavaDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex13_DifferenceBetweenTwoDates {
    public static void main(String[] args) {

        //-----------------------------------------------------------------
        // java.time.Period example to know the difference in days/months/years
        LocalDate endofCentury = LocalDate.of(2014, 01, 01);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(endofCentury, now);

        System.out.printf("Difference is %d years, %d months and %d days old",
                diff.getYears(), diff.getMonths(), diff.getDays());


        //-----------------------------------------------------------------
        // java.time.temporal.ChronoUnit example to know the difference in days/months/years
        LocalDate dateOfBirth = LocalDate.of(1980, Month.JULY, 4);
        LocalDate currentDate = LocalDate.now();
        long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
        long diffInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
        long diffInYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);


        LocalDateTime dateTime1 = LocalDateTime.of(1988, 7, 4, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.now();
        long diffInNano1 = ChronoUnit.NANOS.between(dateTime1, dateTime2);
        long diffInSeconds1 = ChronoUnit.SECONDS.between(dateTime1, dateTime2);
        long diffInMilli1 = ChronoUnit.MILLIS.between(dateTime1, dateTime2);
        long diffInMinutes1 = ChronoUnit.MINUTES.between(dateTime1, dateTime2);
        long diffInHours1 = ChronoUnit.HOURS.between(dateTime1, dateTime2);

        //-----------------------------------------------------------------
        // java.time.Duration example to know the difference in millis/seconds/minutes etc
        LocalDateTime dateTime3 = LocalDateTime.of(1988, 7, 4, 0, 0);
        LocalDateTime dateTime4 = LocalDateTime.now();
        int diffInNano2 = java.time.Duration.between(dateTime3, dateTime4).getNano();
        long diffInSeconds2 = java.time.Duration.between(dateTime3, dateTime4).getSeconds();
        long diffInMilli2 = java.time.Duration.between(dateTime3, dateTime4).toMillis();
        long diffInMinutes2 = java.time.Duration.between(dateTime3, dateTime4).toMinutes();
        long diffInHours2 = java.time.Duration.between(dateTime3, dateTime4).toHours();
    }
}
