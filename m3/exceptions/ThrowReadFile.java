package m3.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ThrowReadFile {
  public static void main(String[] args) throws Exception {
    System.out.println(new ThrowReadFile().readFile("hello.txt"));
  }

  public String readFile(final String location) throws IOException, InvalidPathException {
    final Path filePath = Paths.get(location);
    if (!Files.isRegularFile(filePath)) {
      // add exception here
      throw new FileNotFoundException("There is no file " + location);
    }
    return Files.readString(filePath);
  }
}
