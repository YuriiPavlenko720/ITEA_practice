package M07_02;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String, String> dict01 = new MyDictionary<>();

        dict01.addPair("Вікно", "Window");
        dict01.addPair("Балка", "Beam");
        dict01.addPair("Колона", "Column");
        dict01.addPair("Плита", "Slab");

        System.out.println(dict01.getAnswer("Балка"));

        System.out.println(dict01.size());


        MyDictionary<Integer, Integer> dict02 = new MyDictionary<>();

        dict02.addPair(0, 0);
        dict02.addPair(1, 1);
        dict02.addPair(2, 10);
        dict02.addPair(3, 11);
        dict02.addPair(4, 100);

        System.out.println(dict02.getAnswer(3));

        System.out.println(dict02.size());
    }
}
