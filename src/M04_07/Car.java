package M04_07;

public class Car extends Vehicle{
    public Car(String name, double x, double y, double speed, double price, int year) {
        super(name, x, y, speed, price, year);
    }

    public Car() {
        super("unknown car", 0, 0, 0, 0, 1900);
    }

    public void info(){
        System.out.println("Автомобіль: " + getName() + ".");
        System.out.println("Координати: Х = " + getX() + "м., Y = " + getY() + "м.");
        System.out.println("Швидкість: " + getSpeed() + " км/год.");
        System.out.println("Ціна: " + getPrice() + "$");
        System.out.println("Випуск: " + getYear() + "р.");
    }
}
