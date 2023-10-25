package M08_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("eye");
        list.add("ear");
        list.add("hand");
        list.add("arm");
        list.add("leg");

        doubleValues(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i += 2) {
            arr.add(i + 1, arr.get(i));
        }
        return arr;
    }
}
