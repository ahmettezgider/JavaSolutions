package Java8.JavaDateTime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Ex12_DateFormatting {

    public static void main(String[] args) {
        DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
        formatterBuilder.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                .appendLiteral("-")
                .appendZoneOrOffsetId();
        DateTimeFormatter formatter = formatterBuilder.toFormatter();
        System.out.println(formatter.format(ZonedDateTime.now()));
    }

}

/*
Date Formatting
Date formatting is supported via two classes mainly i.e.
DateTimeFormatterBuilder and DateTimeFormatter.
DateTimeFormatterBuilder works on builder pattern to build custom patterns where as
DateTimeFormatter provides necessary input in doing so.
 */