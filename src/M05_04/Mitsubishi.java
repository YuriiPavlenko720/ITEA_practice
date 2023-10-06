package M05_04;

public class Mitsubishi extends Car {

    private final String name = "Mitsubishi";

    public Mitsubishi(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    public Mitsubishi() {
    }

    public String toString() {
        return "Brand: " + name + " " + super.getModel() +
                "\nPower: " + super.getPower() +
                "\nSpeed: " + super.getSpeed() +
                "\nPrice: " + super.getPrice() +
                "\nYear: " + super.getYearOfManufacture() + "\n";
    }
}
