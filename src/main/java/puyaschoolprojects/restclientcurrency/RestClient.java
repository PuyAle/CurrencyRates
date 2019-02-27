package puyaschoolprojects.restclientcurrency;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestClient {

    public void client() {
        try {
            URL url = new URL("http://data.fixer.io/api/latest?access_key=93c83c2929256213aba41d6809f95038");
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

            CurrencyShell cs = gson.fromJson(output, CurrencyShell.class);
            //System.out.println(cs);
            String bar = "SEK";

            System.out.println(cs.getRates().equals(bar));

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
