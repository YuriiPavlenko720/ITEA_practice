package HW_11_06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class GsonParser {
    public static void parseJson(String url) throws IOException {

        GsonBuilder gBuilder = new GsonBuilder();
        gBuilder.setPrettyPrinting();
        Gson gson = gBuilder.create();

        JsonReader jReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));

        OfficialCurrencyRate[] ocr = gson.fromJson(jReader, OfficialCurrencyRate[].class);

        for (OfficialCurrencyRate rate : ocr) {
            System.out.println(rate);
        }
    }
}
