import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class StreamIntermediateOperations {

  public static void main(String args[]){

//     Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// final Predicate<Integer> isOdd = num -> num % 2 != 0;
// numberStream = numberStream.filter(isOdd);
// numberStream = numberStream.filter(num -> num > 4);
// numberStream.forEach(System.out::println);
final Predicate<Integer> isOdd = num -> num % 2 != 0;
Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        .filter(isOdd)
        .filter(num -> num > 4)
        .forEach(System.out::println);

final String result = Stream.of("Hello", "there", "crazy", "world")
    .map(String::toUpperCase)
    .collect(Collectors.joining(" "));
System.out.println(result);

final Integer result2 = Stream.of("Hello", "there", "crazy", "world")
    .map(String::length)
    .reduce(0, Integer::sum);
System.out.println(result2);

final String result3 = Stream.of("c", "a", "z", "f")
    .sorted()
    .collect(Collectors.joining(", "));
System.out.println(result3);

final String result4 = Stream.of("c", "a", "z", "f")
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.joining(", "));
System.out.println(result4);

final String result10 = Stream.of("This", "is", "a", "test")
    .map(String::toUpperCase)
    .filter(s -> s.length() > 2)
    .sorted()
    .collect(Collectors.joining(" "));

    final String result11 = Stream.of("This", "is", "a", "test")
    .sorted()
    .filter(s -> s.length() > 2)
    .map(String::toUpperCase)
    .collect(Collectors.joining(" "));

    final String result12 = Stream.of("This", "is", "a", "test")
    .filter(s -> s.length() > 2)
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.joining(" "));

    final String result13 = Stream.of("This", "is", "a", "test")
    .map(String::toUpperCase)
    .sorted()
    .filter(s -> s.length() > 2)
    .collect(Collectors.joining(" "));

    System.out.println(result10);
    System.out.println(result11);
    System.out.println(result12);
    System.out.println(result13);
  }

}