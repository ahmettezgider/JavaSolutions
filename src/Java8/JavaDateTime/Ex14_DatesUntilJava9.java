package Java8.JavaDateTime;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Ex14_DatesUntilJava9 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusMonths(2);

        List<LocalDate> listOfDates = startDate.datesUntil(endDate)
                .collect(Collectors.toList());

        System.out.println(listOfDates);
        System.out.println(listOfDates.size());     // 61
    }
}

/*
1. LocalDate.datesUntil() – Java 9
LocalDate‘s datesUntil() method returns a sequential ordered stream of dates.
The returned stream starts from startDate and goes to endDate (exclusive)
by an incremental step of 1 day.
 */