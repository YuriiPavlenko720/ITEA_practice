package M04_07;

public class Plane extends Vehicle{
    private int number;
    private double altitude;

    public Plane(String name, double x, double y, double speed, double price, int year, int number, double altitude) {
        super(name, x, y, speed, price, year);
        this.number = number;
        this.altitude = altitude;
    }

    public Plane() {
        super("unknown plane", 0, 0, 0, 0, 1900);
        this.number = 0;
        this.altitude = 0;
    }

    public void info(){
        System.out.println("Борт: " + getName() + ".");
        System.out.println("Координати: Х = " + getX() + "м., Y = " + getY() + "м.");
        System.out.println("Висота: " + getAltitude() + "м.");
        System.out.println("Швидкість: " + getSpeed() + " км/год.");
        System.out.println("Ціна: " + getPrice() + "$");
        System.out.println("Випуск: " + getYear() + "р.");
        System.out.println("Кількість пасажирів: " + getNumber() + ".");
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
