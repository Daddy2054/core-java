package m3.json;

import java.net.URI;
import java.net.http.*;
import java.time.Duration;
import java.io.*;

public class OfString {

  public static void main(String[] args) throws Exception {

    HttpClient client = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .build();

    URI uri = URI.create("https://cat-fact.herokuapp.com/facts/591f98803b90f7150a19c229");
    HttpRequest request = HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println(response.body());

    File file = new File("catFact.json");
    try (PrintStream out = new PrintStream(new FileOutputStream(file))) {
      out.print(response.body());
    }

  }

}
