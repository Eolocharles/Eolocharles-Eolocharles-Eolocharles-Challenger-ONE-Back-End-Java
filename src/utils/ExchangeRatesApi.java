package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class ExchangeRatesApi {
    public String getExchangeRate() throws IOException, InterruptedException {


        Properties props = new Properties();
        try (InputStream input = new FileInputStream("D:\\workspace\\challenger-converter\\src\\config\\config.properties")) {
            props.load(input);
        }

        String appId = props.getProperty("app_id");


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://openexchangerates.org/api/latest.json?app_id="+ appId + "&base=USD&symbols=BRL,EUR,ARS,CLP,GBP&prettyprint=false&show_alternative=false"))
                .header("accept", "application/json")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();

        return responseBody;
    }

}
