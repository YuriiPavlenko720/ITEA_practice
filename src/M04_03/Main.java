package M04_03;

//HW - 04 - 03
//Створити клас Машина з полями рік(int), колір(String).
//Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
//Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.

class Car {
    private int year;
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
}

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2019, "green");

    }
}


