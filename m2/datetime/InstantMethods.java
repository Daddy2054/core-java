import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantMethods {

  public static void main(String args[]) {

    Instant timestamp;

    timestamp = Instant.now();
    System.out.println(timestamp);
timestamp = Instant.ofEpochMilli(1_675_100_962_725L);
System.out.println(timestamp);
timestamp = Instant.ofEpochSecond(1_675_100_962L);
System.out.println(timestamp);
timestamp = Instant.parse("2023-01-30T17:49:22.725Z");
System.out.println(timestamp);

System.out.println(timestamp.toEpochMilli());
System.out.println(timestamp.getEpochSecond());
System.out.println(timestamp.getNano());

Instant instant = Instant.parse("2023-01-01T00:00:00Z");

// add 1 hour = 60 seconds * 60 minutes
System.out.println(instant.plusSeconds(60 * 60));

// add 1 day = 60 seconds * 60 minutes * 24 hours
System.out.println(instant.plusSeconds(60 * 60 * 24));

Instant instant2 = Instant.parse("2023-01-01T00:00:00Z");

// add 1 hour
System.out.println(instant2.plus(1, ChronoUnit.HOURS));
// add 1 day
System.out.println(instant2.plus(1, ChronoUnit.DAYS));

Instant firstInstant = Instant.parse("2023-01-01T00:00:00Z");
Instant secondInstant = Instant.parse("2022-01-01T00:00:00Z");

System.out.println(firstInstant.isAfter(secondInstant));
System.out.println(firstInstant.isBefore(secondInstant));

  }

}