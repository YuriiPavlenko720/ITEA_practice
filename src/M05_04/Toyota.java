package M05_04;

public class Toyota extends Car {

    private final String name = "Toyota";

    public Toyota(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    public Toyota() {
    }

    public String toString() {
        return "Brand: " + name + " " + super.getModel() +
                "\nPower: " + super.getPower() +
                "\nSpeed: " + super.getSpeed() +
                "\nPrice: " + super.getPrice() +
                "\nYear: " + super.getYearOfManufacture() + "\n";
    }
}
