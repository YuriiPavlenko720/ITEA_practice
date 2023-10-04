package M05_04;

public class Car {
    private String model = "unknown model";
    private double power = 0.0;
    private int speed = 0;
    private double price = 0.0;
    private int yearOfManufacture = 1967;

    public Car(String model, double power, int speed, double price) {
        this.model = model;
        this.power = power;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Brand: " + model +
                "\nPower: " + power +
                "\nSpeed: " + speed +
                "\nPrice: " + price +
                "\nYear: " + yearOfManufacture + "\n";
    }
}
