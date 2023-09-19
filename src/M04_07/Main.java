package M04_07;

//HW - 04 - 07
//        Створіть проект з класом Main.java.
//        Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
//        Створіть 3 похідних класи Plane, Саг та Ship. Для класу Plane має бути визначена висота та кількість пасажирів.
//        Для класу Ship – кількість пасажирів та порт приписки. Написати програму,
//        яка виводить на екран інформацію про кожен засіб пересування.

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Мопед", 500, 0, 15, 100, 1990);
        Vehicle car1 = new Car();
        Vehicle car2 = new Car("Позашляховик директора", 58, 102, 122, 125000, 2022);
        Car car3 = new Car("Фургон №1", 50, 100, 20, 40000, 2020);
        Car car4 = new Car("Фургон №2", 55, 100, 0, 45000, 2021);

        Plane plane1 = new Plane("Літак №1", 4220, 22990, 600, 500000, 2010, 120, 4210);
        Plane plane2 = new Plane("Літак №2", 300, 11000, 0, 600500, 2015, 200, 0);
        Plane plane3 = new Plane();

        Ship ship1 = new Ship ("Корабель №1", 1440, 6020, 35, 670110, 1999, 500, "Одеса");
        Ship ship2 = new Ship();

        System.out.println("\n");
        v1.info();
        System.out.println("\n");
        v2.info();
        System.out.println("\n");
        car1.info();
        System.out.println("\n");
        car2.info();
        System.out.println("\n");
        car3.info();
        System.out.println("\n");
        car4.info();
        System.out.println("\n");
        plane1.info();
        System.out.println("\n");
        plane2.info();
        System.out.println("\n");
        plane3.info();
        System.out.println("\n");
        ship1.info();
        System.out.println("\n");
        ship2.info();
    }
}
