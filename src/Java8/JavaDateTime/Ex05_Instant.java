package Java8.JavaDateTime;

import java.time.Duration;
import java.time.Instant;

public class Ex05_Instant {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.toString());                                 //2013-05-15T05:20:08.145Z
        System.out.println(instant.plus(Duration.ofMillis(5000)).toString());   //2013-05-15T05:20:13.145Z
        System.out.println(instant.minus(Duration.ofMillis(5000)).toString());  //2013-05-15T05:20:03.145Z
        System.out.println(instant.minusSeconds(10).toString());                //2013-05-15T05:19:58.145Z
    }
}

/*
Instant
    For representing the specific timestamp ant any moment, the class needs to be used is Instant.
    The Instant class represents an instant in time to an accuracy of nanoseconds.
    Operations on an Instant include comparison to another Instant and adding or subtracting a duration.
 */