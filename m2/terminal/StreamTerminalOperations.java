import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class StreamTerminalOperations {

  public static void main(String args[]) {

    final IntStream integerFrom0To9 = IntStream.range(0, 10);
    integerFrom0To9.forEach(number -> System.out.println(number));
    // or just
    // integerFrom0To9.forEach(System.out::println);

    final Stream<Integer> intStream = Stream.of(10, 3, 6, 8);
    System.out.println(intStream.min(Comparator.comparingInt(e -> e)).orElse(0));
    final Stream<Integer> intStream2 = Stream.of(10, 3, 6, 8);
    System.out.println(intStream2.max(Comparator.comparingInt(e -> e)).orElse(0));

    final Predicate<Integer> isOdd = num -> num % 2 != 0;
    System.out.println(Stream.of(1, 2, 3, 7, 9).allMatch(isOdd));
    System.out.println(Stream.of(1, 2, 3, 7, 9).anyMatch(isOdd));

    final Integer[] numbers = { 1, 3, 7, 9, 9 };
    System.out.println(Stream.of(numbers).collect(Collectors.toList()));
    System.out.println(Stream.of(numbers).collect(Collectors.toSet()));
  }

}

// How many terminal operations can a stream have?

// Exactly 1

// At least 1

// As many as you want - like intermediate operations

// 1 or 2

// A stream can have exactly 1 terminal operation because terminal operations
// are the final operation that take in a Stream and return something that is
// not a Stream.

// Note: Technically, a stream can be created and never used, which is 0
// terminal operations.