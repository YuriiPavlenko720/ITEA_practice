package M04_07;

public class Car extends Vehicle{
    public Car(String name, double x, double y, double speed, double price, int year) {
        setName(name);
        setX(x);
        setY(y);
        setSpeed(speed);
        setPrice(price);
        setYear(year);
    }

    public Car() {
        setName("unknown car");
        setX(0);
        setY(0);
        setSpeed(0);
        setPrice(0);
        setYear(1900);
    }

    public void info(){
        System.out.println("Автомобіль: " + getName() + ".");
        System.out.println("Координати: Х = " + getX() + "м., Y = " + getY() + "м.");
        System.out.println("Швидкість: " + getSpeed() + " км/год.");
        System.out.println("Ціна: " + getPrice() + "$");
        System.out.println("Випуск: " + getYear() + "р.");
    }
}
