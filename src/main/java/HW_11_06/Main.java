package HW_11_06;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            GsonParser.parseJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
