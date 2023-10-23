package M08_01;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
        list01.add("Береза");
        list01.add("Бук");
        list01.add("Дуб");
        list01.add("Вільха");
        list01.add("Сосна");
        list01.add("Клен");
        list01.add("Каштан");
        list01.add("Акація");
        list01.add("Тополь");
        list01.add("Липа");

        Iterator<String> iterate = list01.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}
