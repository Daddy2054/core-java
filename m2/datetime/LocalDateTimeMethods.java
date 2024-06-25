import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeMethods {

  public static void main(String args[]) {
    LocalDateTime dateInJanuary = LocalDateTime.parse("2023-01-01T11:50");
    System.out.println(dateInJanuary.plusYears(6));
    System.out.println(dateInJanuary.plusDays(60));
    System.out.println(dateInJanuary.plusMinutes(6050));

    LocalDateTime dateInJanuaryb = LocalDateTime.parse("2023-01-01T11:50");
    LocalDateTime dateInFebruary = LocalDateTime.parse("2023-02-01T11:50");

    System.out.println(dateInJanuaryb.isBefore(dateInFebruary));
    System.out.println(dateInJanuaryb.isAfter(dateInFebruary));
    System.out.println(dateInJanuaryb.isEqual(dateInFebruary));

    LocalDateTime dateInJanuary2 = LocalDateTime.parse("2023-01-01T11:50");

    System.out.println(dateInJanuary2.format(DateTimeFormatter.ISO_DATE_TIME));

    LocalDateTime dateInJanuary3 = LocalDateTime.parse("2023-01-01T11:50");

    DateTimeFormatter formatterYyyyMMdd = DateTimeFormatter.ofPattern("yyyy MM dd");
    System.out.println(dateInJanuary3.format(formatterYyyyMMdd));

    DateTimeFormatter formatterMMYyyydd = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    System.out.println(dateInJanuary3.format(formatterMMYyyydd));

  }

}