package Java8.JavaDateTime;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class Ex11_TimezoneChanges {
    public static void main(String[] args) {

        //Zone rules
        System.out.println(ZoneRules.of(ZoneOffset.of("+02:00")).isDaylightSavings(Instant.now()));
        System.out.println(ZoneRules.of(ZoneOffset.of("+02:00")).isFixedOffset());

    }
}

/*
Timezone Changes
Timezone related handling is done by 3 major classes. These are ZoneOffset, TimeZone, ZoneRules.

The ZoneOffset class represents a fixed offset from UTC in seconds.
This is normally represented as a string of the format “±hh:mm”.
The TimeZone class represents the identifier for a region where specified time zone rules are defined.
The ZoneRules are the actual set of rules that define when the zone-offset changes.
 */