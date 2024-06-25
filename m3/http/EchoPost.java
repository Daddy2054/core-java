package m3.http;

import java.net.URI;
import java.net.http.*;
import java.time.Duration;

public class EchoPost {
  public static void main(String[] args) throws Exception {

    HttpClient client = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .build();

    // WRITE YOUR CODE HERE
    URI uri = URI.create("https://postman-echo.com/post");
    HttpRequest request = HttpRequest.newBuilder()
        .uri(uri)
        .header("Content-Type", "application/json")
        .POST(HttpRequest.BodyPublishers.ofString("{\"action\":\"hello\"}"))
        .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println("HTTP Status Code = " + response.statusCode());
    System.out.println("HTTP Body = \n" + response.body());
  }
}
