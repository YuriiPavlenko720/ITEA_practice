package M04_04;

//HW - 04 - 04
//Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
// Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
// Перевантажити конструктори викликаючи конструктор із конструктора. Створити клас Main,
// де створити екземпляри класу Машина з різними параметрами.

class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car(int year, double speed, String color) {
        this(year, color);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, color);
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2019, "green");
        Car car4 = new Car(2018, 180.0, "red");
        Car car5 = new Car(2021, 220.0, 1540, "black");

    }
}


