package m2.coding;

// FREEZE CODE BEGINS
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercise5 {

  public static void main(String[] args) {

    String timeZoneRegion = args[0];
    String timestamp = args[1];

    // FREEZE CODE ENDS

    // WRITE YOUR CODE HERE
    // String timeZoneRegion = "Europe/London";
    // String timestamp = "2023-02-01T11:50:37Z";

    ZoneId zoneIdLondon = ZoneId.of(timeZoneRegion);
    Instant instantInFebruary = Instant.parse(timestamp);

    System.out
        .println(DateTimeFormatter.ISO_LOCAL_TIME.format(ZonedDateTime.ofInstant(instantInFebruary, zoneIdLondon)));

    // FREEZE CODE BEGINS
  }

}
// FREEZE CODE ENDS

// One possible solution:

// ZoneId zoneId = ZoneId.of(timeZoneRegion);
// Instant instant = Instant.parse(timestamp);
// ZonedDateTime zoneDT = ZonedDateTime.ofInstant(instant, zoneId);
// System.out.println(zoneDT.format(DateTimeFormatter.ISO_LOCAL_TIME));
