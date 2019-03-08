package client;

import currencypojo.CurrencyShell;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestClient {

    public CurrencyShell client(String inputUrl) {
        CurrencyShell cs;
        try {
            URL url = new URL(inputUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod(
                    "GET");
            conn.setRequestProperty(
                    "Accept", "application/json");

            if (conn.getResponseCode()
                    != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output = br.readLine();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            cs = gson.fromJson(output, CurrencyShell.class);

        } catch (MalformedURLException e) {

            e.printStackTrace();
            return null;

        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }
        return cs;
    }
}
