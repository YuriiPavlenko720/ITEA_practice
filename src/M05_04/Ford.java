package M05_04;

public class Ford extends Car {

    private final String name = "Ford";

    public Ford(String model, double power, int speed, double price) {
        super(model, power, speed, price);
    }

    public Ford() {
    }

    public String toString() {
        return "Brand: " + name + " " + super.getModel() +
                "\nPower: " + super.getPower() +
                "\nSpeed: " + super.getSpeed() +
                "\nPrice: " + super.getPrice() +
                "\nYear: " + super.getYearOfManufacture() + "\n";
    }
}
