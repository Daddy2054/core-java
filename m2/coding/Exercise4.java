package m2.coding;

// FREEZE CODE BEGINS
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercise4 {

  public static void main(String args[]) {

// FREEZE CODE ENDS
   String timestamp = args[0];

// WRITE YOUR CODE HERE
// String timestamp = "2023-01-01T11:50";
LocalDateTime timestampParsed = LocalDateTime.parse(timestamp);
System.out.println(String.format("%02d", timestampParsed.getDayOfMonth()));

// FREEZE CODE BEGINS
  }

}
// FREEZE CODE ENDS

// our solution
// LocalDateTime date = LocalDateTime.parse(timestamp);
// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
// System.out.println(date.format(formatter));
