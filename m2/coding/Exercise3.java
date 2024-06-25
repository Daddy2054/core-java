package m2.coding;

// FREEZE CODE BEGINS
import java.util.*;
import java.util.stream.*;

public class Exercise3 {

  public static void main(String args[]) {

    Stream<String> stream = Stream.of(args);
    // FREEZE CODE ENDS

    // WRITE YOUR CODE HERE
    // args = ["1", "2", "3", "4", "5"];
    final Integer result = stream
        .map(String::trim) // <1>
        .map(Integer::parseInt) // <2>
        .reduce(0, Integer::sum);
    System.out.println(result);

    // FREEZE CODE BEGINS
  }

}
// FREEZE CODE ENDS

//our solution is

// System.out.println(stream.map(Integer::valueOf)
//             .reduce(0, Integer::sum));