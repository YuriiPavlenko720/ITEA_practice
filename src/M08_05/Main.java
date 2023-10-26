package M08_05;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    private static PriorityQueue<Cell> list = new PriorityQueue<>();

    public static void main(String[] args) {
        list.add(new Cell("Львів", "Іванови"));
        list.add(new Cell("Київ", "Петрови"));
        list.add(new Cell("Лондон", "Абрамовичі"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть місто: ");
        String input = scanner.next();
        System.out.println(list);
        System.out.println("В місті живуть " + getFamily(input, list) + ".");
    }

    public static String getFamily(String city, PriorityQueue<Cell> queue){
        Cell founded;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            founded = queue.poll();
            if (founded != null && founded.city.equals(city)) {
                return founded.family;
            }
        }
        return null;
    }

    static class Cell implements Comparable {
        String city;
        String family;

        public Cell(String city, String family) {
            this.city = city;
            this.family = family;
        }

        @Override
        public int compareTo(Object o) {
            int temp = this.city.compareTo(((Cell) o).city);
            if (temp == 0) {
                return this.family.compareTo(((Cell) o).family);
            } else {
                return temp;
            }
        }

        @Override
        public java.lang.String toString() {
            return "Cell{" +
                    "city=" + city +
                    ", family=" + family +
                    '}';
        }
    }
}
