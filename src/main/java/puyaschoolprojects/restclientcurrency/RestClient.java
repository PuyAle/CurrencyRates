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
                    "Accept", "application/xml");

            if (conn.getResponseCode()
                    != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output = br.readLine();

            System.out.println(
                    "Output from Server .... \n");
            if (output
                    != null) {
                System.out.println(output);
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            System.out.println(gson.toString());
            // Shell shell = gson.fromJson(output, Shell.class);

//            Stream<Teacher> st = Arrays.stream(teachers);
//            List<Teacher> teachersList = Arrays.asList(teachers);
//
//            for (Currency te : teachers) {
//                System.out.println(te);
//
//            }
//            conn.disconnect();
        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
