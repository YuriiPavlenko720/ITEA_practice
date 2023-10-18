package M07_03;

public class Main {
    public static void main(String[] args) {
        ModernUnidirectionalLinkedList<String> list01 = new ModernUnidirectionalLinkedList<>();


        list01.add("Кавун");
        list01.add("Вишня");

        try {
        list01.add(1, "Яблуко");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Значення індексу знаходиться за межами кількості елементів - " + e);
        }

        list01.insertHead("Полуниця");

        System.out.println(list01);
        System.out.println(list01.size());

        list01.remove("Яблуко");

        try {
            list01.remove(2);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Значення індексу знаходиться за межами кількості елементів - " + e);
        }

        System.out.println(list01);
        System.out.println(list01.size());
    }
}
