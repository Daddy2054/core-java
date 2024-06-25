package m2.datetime;

import java.time.*;

public class LocalDateTimeExamples {

  public static void main(String args[]) {

    LocalDate now = LocalDate.now();
    System.out.println(now);
    LocalDate firstOfJanuary2023 = LocalDate.parse("2023-01-01");
    System.out.println(firstOfJanuary2023);
    LocalDate firstOfJanuary2023a = LocalDate.of(2023, 1, 1);
    System.out.println(firstOfJanuary2023a);

    LocalDate firstOfFebruary2023b = LocalDate.of(2023, Month.FEBRUARY, 1);
    System.out.println(firstOfFebruary2023b);

    LocalTime now2 = LocalTime.now();
    System.out.println(now2);

    LocalTime time = LocalTime.parse("11:50:35.130");
    System.out.println(time);
    LocalTime time2 = LocalTime.parse("11:50:35");
    System.out.println(time2);
    LocalTime time3 = LocalTime.parse("11:50");
    System.out.println(time3);
    LocalTime time4 = LocalTime.of(11, 50, 35, 130000000);
    System.out.println(time4);
    LocalTime time5 = LocalTime.of(11, 50, 35);
    System.out.println(time5);
    LocalTime time6 = LocalTime.of(11, 50);
    System.out.println(time6);

    LocalDateTime firstOfJanuary2023time1150am = LocalDateTime.of(2023, Month.JANUARY, 1, 11, 50);
    System.out.println(firstOfJanuary2023time1150am);
  }

}