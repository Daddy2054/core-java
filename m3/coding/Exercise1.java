package m3.coding;

// FREEZE CODE BEGINS
import java.io.*;
import java.nio.file.*;

public class Exercise1 {
  // FREEZE CODE ENDS
  public static void main(String[] args) throws Exception {
    System.out.println(new Exercise1().readFile(args[0]));
  }

  public String readFile(final String location) throws InvalidPathException, IOException {
    final Path filePath = Paths.get(location);

    // WRITE YOUR CODE HERE
    if (!Files.isRegularFile(filePath)) {
      throw new NoSuchFileException("No such file");
    }
    // FREEZE CODE BEGINS
    return Files.readString(filePath);
  }
}
// FREEZE CODE ENDS
