package M04_03;

//HW - 04 - 03
//Створити клас Машина з полями рік(int), колір(String).
//Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
//Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2019, "green");

    }
}


