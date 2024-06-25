package m2.coding;

// FREEZE CODE BEGINS
import java.util.*;
import java.util.stream.*;
import java.io.IOException;
import java.nio.file.*;

public class Exercise2 {

  public static void main(String args[]) {

    String filename = args[0];
    String[] array = Arrays.copyOfRange(args, 1, args.length);

    // FREEZE CODE ENDS

    // WRITE YOUR CODE HERE
    final Stream<String> arrayStream = Stream.of(array);
    Stream<String> fileStream = Stream.empty();
    try {
      fileStream = Files.lines(Paths.get(filename));
    } catch (Exception e) {
      e.printStackTrace();
    }

    // FREEZE CODE BEGINS
    arrayStream.forEach(System.out::println);
    fileStream.forEach(System.out::println);
  }

}
// FREEZE CODE ENDS