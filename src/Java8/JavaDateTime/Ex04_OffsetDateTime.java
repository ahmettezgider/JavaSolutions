package Java8.JavaDateTime;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex04_OffsetDateTime {
    public static void main(String[] args) {

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime.toString());              //2013-05-15T10:10:37.257+05:30

        offsetDateTime = OffsetDateTime.now(ZoneId.of("+05:30"));
        System.out.println(offsetDateTime.toString());              //2013-05-15T10:10:37.258+05:30

        offsetDateTime = OffsetDateTime.now(ZoneId.of("-06:30"));
        System.out.println(offsetDateTime.toString());              //2013-05-14T22:10:37.258-06:30

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(zonedDateTime.toString());               //2013-05-15T06:45:45.290+02:00[Europe/Paris]

    }
}

/*
    If you want to use the date functionality with zone information,
    then Lambda provide you extra 3 classes similar to above one i.e. OffsetDate,
    OffsetTime and OffsetDateTime. Timezone offset can be represented
    in “+05:30” or “Europe/Paris” formats. This is done via using another class i.e. ZoneId.
 */