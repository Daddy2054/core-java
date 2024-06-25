import java.time.*;

public class PeriodDuration {

  public static void main(String[] args) {

    LocalDate firstDate = LocalDate.parse("2023-01-01");
    LocalDate secondDate = LocalDate.parse("2019-05-19");

    Period period = Period.between(secondDate, firstDate);
    System.out.format("years = %d, months = %d, days = %d", period.getYears(), period.getMonths(), period.getDays());

    LocalTime startTime = LocalTime.parse("10:51");
    LocalTime endTime = LocalTime.parse("13:04");

    System.out.println("\nDuration between times is " +
        Duration.between(startTime, endTime).getSeconds());

    LocalDateTime firstDate2 = LocalDateTime.parse("2023-01-01T11:50");
    LocalDateTime secondDate2 = LocalDateTime.parse("2019-05-19T23:15");

    Duration period2 = Duration.between(secondDate2, firstDate2);

    System.out.format("days = %d, hours = %d, minutes = %d\n", period2.toDays(), period2.toHoursPart(),
        period2.toMinutesPart());

    System.out.format("days = %d, hours = %d, minutes = %d", period2.toDays(), period2.toHours(), period2.toMinutes());

  }

}