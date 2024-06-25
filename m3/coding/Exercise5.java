package m3.coding;

// FREEZE CODE BEGINS
import java.net.URI;
import java.net.http.*;
import java.time.Duration;
import java.io.*;
import java.nio.file.Path;

public class Exercise5 {

  public static void main(String[] args) throws Exception {
    HttpClient client = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .build();

    URI uri = URI.create(args[0]);
    HttpRequest request = HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .build();
    // FREEZE CODE ENDS
    // WRITE YOUR CODE HERE
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    File file = new File("output.json");
    try (PrintStream out = new PrintStream(new FileOutputStream(file))) {
      out.print(response.body());
    }
    // FREEZE CODE BEGINS
  }
}
// FREEZE CODE ENDS


//our solution
// You can use the .ofFile body handler to save the file directly:

// HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(Path.of("output.json")));
// Or you can use .ofString and then write the returned string to a file manually:

// HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
// File file = new File("output.json");
// try (PrintStream out = new PrintStream(new FileOutputStream(file))) {
//     out.print(response.body());
// }