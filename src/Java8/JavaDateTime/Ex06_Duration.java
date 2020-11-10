package Java8.JavaDateTime;

import java.time.Duration;
import java.time.Instant;

public class Ex06_Duration {
    public static void main(String[] args) {
        Duration duration = Duration.ofMillis(5000);
        System.out.println(duration.toString());     //PT5S

        duration = Duration.ofSeconds(60);
        System.out.println(duration.toString());     //PT1M

        duration = Duration.ofMinutes(10);
        System.out.println(duration.toString());     //PT10M

        duration = Duration.ofHours(2);
        System.out.println(duration.toString());     //PT2H

        duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
        System.out.println(duration.toString());  //PT10M
    }
}

/*
Duration
Duration class is a whole new concept brought first time in java language.
It represents the time difference between two time stamps.

Duration deals with small unit of time such as milliseconds, seconds, minutes and hour.
They are more suitable for interacting with application code.
 */