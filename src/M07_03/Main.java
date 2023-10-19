package M07_03;

public class Main {
    public static void main(String[] args) {
        ModernUnidirectionalLinkedList<String> list01 = new ModernUnidirectionalLinkedList<>();


        list01.add("Кавун");
        list01.add("Вишня");

        System.out.println(list01);

        list01.add(1, "Яблуко");

        System.out.println(list01);

        list01.insertHead("Полуниця");

        System.out.println(list01);
        System.out.println(list01.size());

        list01.remove("Яблуко");

        System.out.println(list01);

        list01.remove(2);

        System.out.println(list01);
        System.out.println(list01.size());
    }
}
