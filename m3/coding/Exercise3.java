package m3.coding;

// FREEZE CODE BEGINS
import java.net.URI;
import java.net.http.*;
import java.time.Duration;

public class Exercise3 {

  public static void main(String[] args) throws Exception {
    URI uri = URI.create(args[0]);
    // FREEZE CODE ENDS
    // WRITE YOUR CODE HERE
    HttpClient client = HttpClient.newBuilder()
        .version(Version.HTTP_1_1)
        .followRedirects(Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(5))
        .build();
    // URI uri = URI.create("https://example.com");
    HttpRequest request = HttpRequest.newBuilder()
        .GET()
        .uri(uri)
        .header("Accept", "text/html")
        .build();
    // FREEZE CODE BEGINS
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println("HTTP Status Code = " + response.statusCode());
    if (response.statusCode() < 400)
      System.out.println("HTTP Body = \n" + response.body());
  }
}
// FREEZE CODE ENDS


// A sample solution is:

// HttpClient client = HttpClient.newBuilder()
//     .version(HttpClient.Version.HTTP_1_1)
//     .followRedirects(HttpClient.Redirect.NORMAL)
//     .connectTimeout(Duration.ofSeconds(20))
//     .build();

// HttpRequest request = HttpRequest.newBuilder()
//     .GET()
//     .uri(uri)
//     .header("Accept", "text/html") 
//     .build();