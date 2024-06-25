package m2.datetime;

import java.time.*;

public class InstantTime {

  public static void main(String args[]) {

    Instant currentTimestamp = Instant.now();

    System.out.println(currentTimestamp.toEpochMilli());


  }

}