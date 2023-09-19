package M04_07;

public class Vehicle {
    String name;
    private double x;
    private double y;
    private double speed;
    private double price;
    private int year;

    public void info(){
        System.out.println("Засіб пересування: " + getName() + ".");
        System.out.println("Координати: Х = " + getX() + "м., Y = " + getY() + "м.");
        System.out.println("Швидкість: " + getSpeed() + " км/год.");
        System.out.println("Ціна: " + getPrice() + "$");
        System.out.println("Випуск: " + getYear() + "р.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public Vehicle(String name, double x, double y, double speed, double price, int year) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.price = price;
        this.year = year;
    }

    public Vehicle() {
        setName("unknown vehicle");
        setX(0);
        setY(0);
        setSpeed(0);
        setPrice(0);
        setYear(1900);
    }
}
