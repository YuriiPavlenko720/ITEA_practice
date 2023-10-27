package M08_05v2;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        SortedMap<String, String> list = new TreeMap<>();

        list.put("Львів", "Іванови");
        list.put("Київ", "Петрови");
        list.put("Лондон", "Абрамовичі");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть місто: ");
        String input = scanner.next();

        System.out.println("В місті живуть " + list.get(input) + ".");

    }
}
