package m2.streams;

import java.util.stream.*;
import java.util.*;
import java.nio.file.*;

public class CreateStream {

  public static void main(String args[]) {

    final Stream<String> stream = List.of("a", "b", "c").stream();

    // print out stream
    System.out.println(stream.collect(Collectors.toList()));
    // .collect will be explained with terminal operators
    IntStream stream2 = IntStream.range(0, 10);
    stream2.forEach(System.out::println);

    final Stream.Builder<Integer> streamBuilder = Stream.builder();

    streamBuilder.accept(1);
    streamBuilder.accept(2);
    streamBuilder.accept(3);

    final Stream<Integer> stream3 = streamBuilder.build();
    stream3.forEach(System.out::println);
  }

}

// Try these variations:
// Replace the stream with a Set-based stream:
// final Stream<String> stream = Set.of("a", "b", "c").stream();
// RUN
// [a, b, c]
// Replace the stream with a Map-based stream:
// final Stream<String> stream = Map.of("key", "value").values().stream();
// RUN
// [a, b, c]