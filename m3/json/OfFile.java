package m3.json;

import java.net.URI;
import java.net.http.*;
import java.nio.file.Path;
import java.time.Duration;

public class OfFile {

  public static void main(String[] args) throws Exception {

    HttpClient client = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .build();

    URI uri = URI.create("https://httpcats.com/404.jpg");
    HttpRequest request = HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .build();

    HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(Path.of("404.jpg")));

  }

}
