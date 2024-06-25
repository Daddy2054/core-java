package m3.json;

import java.net.URI;
import java.net.http.*;
import java.nio.file.*;
import java.time.Duration;
import java.util.Base64;

public class OfByteArray {
  public static void main(String[] args) throws Exception {

    HttpClient client = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_1_1)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .build();

    URI uri = URI.create("https://http.dog/200.jpg");
    HttpRequest request = HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .build();

    HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
    String encodedString = Base64.getEncoder().encodeToString(response.body());
    Files.writeString(Path.of("dog.html"), "<img src=\"data:image/png;base64," + encodedString + "\"\n" + ">");
  }

}
