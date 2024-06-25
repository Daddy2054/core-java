import java.time.*;

public class ZonedDate {

  public static void main(String args[]) {
ZoneId zoneIdLondon = ZoneId.of("Europe/London");
LocalDateTime dateInJanuary = LocalDateTime.parse("2023-01-01T11:50:37");
Instant instantInFebruary = Instant.parse("2023-02-01T11:50:37Z");

System.out.println(ZonedDateTime.of(dateInJanuary, zoneIdLondon));
System.out.println(ZonedDateTime.ofInstant(instantInFebruary, zoneIdLondon));
      

  }

}