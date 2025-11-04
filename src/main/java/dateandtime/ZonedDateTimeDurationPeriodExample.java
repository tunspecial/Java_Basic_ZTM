package dateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        //oversea event
        // Parameters: (year, month, day, hour, minute, second, nanosecond, zoneId)
        ZonedDateTime overseaEvent = ZonedDateTime.of(2024,11,30,10,30,0,0,ZoneId.of("Asia/Tokyo"));
        System.out.println("Oversea Event:" + overseaEvent);

        //duration between two localtime object
                // PT#H#M#S
                // │  │ │  └── Seconds (S)
                // │  │ └───── Minutes (M) 
                // │  └─────── Hours (H)
                // └────────── Time Designator (T) and Period Designator (P)
        LocalTime start = LocalTime.of(9,10);
        LocalTime end = LocalTime.of(13,30);
        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration);


        //Period between two localDate object
                // P#Y#M#D
                // │ │ │ └── Days (D)
                // │ │ └──── Months (M)
                // │ └────── Years (Y) 
                // └──────── Period Designator (P)
        LocalDate startDate = LocalDate.of(2024,6,11);
        LocalDate endDate = LocalDate.of(2024,12,31);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period);
    }
}
 