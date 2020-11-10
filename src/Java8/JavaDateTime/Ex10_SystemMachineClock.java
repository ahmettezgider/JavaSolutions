package Java8.JavaDateTime;

import java.time.Clock;
import java.time.Duration;
import java.time.ZoneId;

public class Ex10_SystemMachineClock {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);                      //SystemClock[Asia/Calcutta]
        System.out.println(clock.instant().toString()); //2013-05-15T06:36:33.837Z
        System.out.println(clock.getZone());            //Asia/Calcutta

        Clock anotherClock = Clock.system(ZoneId.of("Europe/Tiraspol"));
        System.out.println(anotherClock);                       //SystemClock[Europe/Tiraspol]
        System.out.println(anotherClock.instant().toString());  //2013-05-15T06:36:33.857Z
        System.out.println(anotherClock.getZone());             //Europe/Tiraspol

        Clock forwardedClock  = Clock.tick(anotherClock, Duration.ofSeconds(600));
        System.out.println(forwardedClock.instant().toString());  //2013-05-15T06:30Z
    }
}

/*
New class to simulate system/machine clock
A new class Clock is proposed in new release. This simulates the system clock functionality.
I loved this feature most of all others. The reason is while doing unit testing.
You are often required to test a API in future date.
For this we had been forwarding the system clock for next date, and then again restart the server
and test the application.
 */