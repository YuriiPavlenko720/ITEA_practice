package M07_01;

public class Main {
    public static void main(String[] args) {

        MyList<String> furniture = new MyList<>();

        furniture.add("Sofa");
        furniture.add("Table");
        furniture.add("Bed");

        try {
            System.out.println(furniture.valueOf(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Значення індексу знаходиться за межами кількості елементів - " + e);
        }

        System.out.println(furniture.length());


        MyList<Double> distances = new MyList<>();

        distances.add(55.4);
        distances.add(77.11);
        distances.add(118.333);
        distances.add(0.0);

        try {
            System.out.println(distances.valueOf(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Значення індексу знаходиться за межами кількості елементів - " + e);
        }

        System.out.println(distances.length());
    }
}
