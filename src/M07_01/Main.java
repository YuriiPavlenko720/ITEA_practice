package M07_01;

public class Main {
    public static void main(String[] args) {

        MyList<String> furniture = new MyList<>();

        furniture.add("Sofa");
        furniture.add("Table");
        furniture.add("Bed");
        furniture.add("Chair");
        furniture.add("Armchair");

        System.out.println(furniture.valueOf(3));

        System.out.println(furniture.length());


        MyList<Double> distances = new MyList<>();

        distances.add(55.4);
        distances.add(77.11);
        distances.add(118.333);
        distances.add(0.0);

        System.out.println(distances.valueOf(2));

        System.out.println(distances.length());
    }
}
