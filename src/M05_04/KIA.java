package M05_04;

public class KIA extends Car {

    private final String name = "KIA";

    public KIA(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    public KIA() {
    }

    public String toString() {
        return "Brand: " + name + " " + super.getModel() +
                "\nPower: " + super.getPower() +
                "\nSpeed: " + super.getSpeed() +
                "\nPrice: " + super.getPrice() +
                "\nYear: " + super.getYearOfManufacture() + "\n";
    }
}