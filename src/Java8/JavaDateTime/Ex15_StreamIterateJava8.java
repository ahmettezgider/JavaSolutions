package Java8.JavaDateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex15_StreamIterateJava8 {
    public static void main(String[] args) {

        //-----------------------------------------------------------------
        //
        LocalDate startDate1 = LocalDate.now();
        LocalDate endDate1 = startDate1.plusMonths(2);

        long numOfDays1 = ChronoUnit.DAYS.between(startDate1, endDate1);

        List<LocalDate> listOfDates = Stream.iterate(startDate1, date -> date.plusDays(1))
                .limit(numOfDays1)
                .collect(Collectors.toList());

        System.out.println(listOfDates.size());     // 61


        //-----------------------------------------------------------------
        //
        LocalDate startDate2 = LocalDate.now();
        LocalDate endDate2 = startDate2.plusMonths(2);

        long numOfDays2 = ChronoUnit.DAYS.between(startDate2, endDate2);

        List<LocalDate> listOfDates2 = LongStream.range(0, numOfDays2)
                .mapToObj(startDate2::plusDays)
                .collect(Collectors.toList());

        System.out.println(listOfDates.size());     // 61
    }
}

/*
2. Stream.iterate() – Java 8
To get all dates, create a stream of dates adding adding 1 to startdate and so on, until end date.
 */