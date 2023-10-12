package M06_06;

public class Main {
    public static void main(String[] args) {
        Vehicles bmw = Vehicles.BMW;
        bmw.setColor("white");

        Vehicles audi = Vehicles.AUDI;
        audi.setColor("black");

        System.out.println(bmw);
        System.out.println(audi);
    }
}
