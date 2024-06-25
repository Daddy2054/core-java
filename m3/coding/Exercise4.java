package m3.coding;

// FREEZE CODE BEGINS
import java.net.URI;
import java.net.http.*;
import java.time.Duration;

public class Exercise4 {

  public static void main(String[] args) throws Exception {
    URI uri = URI.create("https://postman-echo.com/post");
    String messageToPost = args[0];
    // FREEZE CODE ENDS
    // WRITE YOUR CODE HERE
    HttpClient client = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .build();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(uri)
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString("{\"action\":\"hello\"}"))
        .build();
    // FREEZE CODE BEGINS
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println("HTTP Status Code = " + response.statusCode());
    if (response.statusCode() < 400)
      System.out.println("HTTP Body = \n" + response.body());
  }
}
// FREEZE CODE ENDS
//sample solution
// HttpClient client = HttpClient.newBuilder()
//     .version(HttpClient.Version.HTTP_1_1)
//     .followRedirects(HttpClient.Redirect.NORMAL)
//     .connectTimeout(Duration.ofSeconds(20))
//     .build();

// HttpRequest request = HttpRequest.newBuilder()
//   .uri(uri) // URI created on first step
//   .header("Content-Type", "application/json")
//   .POST(HttpRequest.BodyPublishers.ofString(messageToPost))
//   .build();