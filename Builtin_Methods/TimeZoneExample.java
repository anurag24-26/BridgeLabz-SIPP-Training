package Builtin_Methods;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Define formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("GMT Time: " + gmtTime.format(formatter));

        // Current time in IST (India Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST Time: " + istTime.format(formatter));

        // Current time in PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("PST Time: " + pstTime.format(formatter));
    }
}
