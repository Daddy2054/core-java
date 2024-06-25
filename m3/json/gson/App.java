package m3.json.gson;

package com.codio.examples;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import com.google.gson.*;

public class App {

    public static void main(String[] args) throws Exception {
        printCatFactById("591f98803b90f7150a19c229");
    }

    public static void printCatFactById(final String id) throws Exception {
        
        final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .followRedirects(HttpClient.Redirect.NORMAL)
            .connectTimeout(Duration.ofSeconds(20))
            .build();
        
        final URI uri = URI.create("https://cat-fact.herokuapp.com/facts/" + id);
        final HttpRequest request = HttpRequest.newBuilder()
            .uri(uri)
            .GET()
            .build();

        final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        final String catFactResponseString = response.body();

        final Gson gson = new Gson();
        final CatFactResponse catFactResponse = gson.fromJson(catFactResponseString, CatFactResponse.class);
        System.out.println(catFactResponse.getText());

    }
}

