package M05_04;

public abstract class Car {
    private String model = "unknown model";
    private double power = 0.0;
    private int speed = 0;
    private double price = 0.0;
    private int yearOfManufacture = 1967;

    public Car(String model, double power, int speed, double price) {
        this.model = model;
        this.power = checkPower(power);
        this.speed = checkSpeed(speed);
        this.price = checkPrice(price);
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

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double checkPower (double power) {
        if (power > 200) {
            return 200;
        } else if (power < 0) {
            return 0;
        } else {
            return power;
        }
    }

    public int checkSpeed (int speed) {
        if (speed > 320) {
            return 320;
        } else if (speed < 0) {
            return 0;
        } else {
            return speed;
        }
    }

    public double checkPrice (double price) {
        if (price > 50000) {
            return 50000;
        } else if (price < 0) {
            return 0;
        } else {
            return price;
        }
    }
}
