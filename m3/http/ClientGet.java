package m3.http;

import java.net.URI;
import java.net.http.*;
import java.net.http.HttpClient.*;
import java.time.Duration;

public class ClientGet {

  public static void main(String[] args) throws Exception {

    HttpClient client = HttpClient.newBuilder()
        .version(Version.HTTP_1_1)
        .followRedirects(Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(5))
        .build();
    URI uri = URI.create("https://example.com");
    HttpRequest request = HttpRequest.newBuilder()
        .GET()
        .uri(uri)
        .header("Accept", "text/html")
        .build();

    HttpResponse<String> response;
    response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());
    System.out.println(response.statusCode());
    System.out.println(response.headers());
    System.out.println(response.version());
  }
}
