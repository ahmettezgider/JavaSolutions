package Java8.JavaStream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream15_FindMaxMinDate {

    public static void main(String[] args) {

        LocalDate start = LocalDate.now();
        LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());

        //Create stream of dates
        List<LocalDate> dates = Stream.iterate(start, date -> date.plusDays(1))
                .limit(ChronoUnit.DAYS.between(start, end))
                .collect(Collectors.toList());

        // Get Min or Max Date
        LocalDate maxDate = dates.stream()
                .max( Comparator.comparing( LocalDate::toEpochDay ) )
                .get();

        LocalDate minDate = dates.stream()
                .min( Comparator.comparing( LocalDate::toEpochDay ) )
                .get();

        System.out.println("maxDate = " + maxDate);
        System.out.println("minDate = " + minDate);

        //--------------------------------------------------------
        // Get Min or Max Number
        Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);


        //--------------------------------------------------------
        // Get Min or Max String/Char
        String maxChar = Stream.of("H", "T", "D", "I", "J")
                .max(Comparator.comparing(String::valueOf))
                .get();

        String minChar = Stream.of("H", "T", "D", "I", "J")
                .min(Comparator.comparing(String::valueOf))
                .get();

        System.out.println("maxChar = " + maxChar);
        System.out.println("minChar = " + minChar);
    }
}
