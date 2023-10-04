package M05_04;

//HW - 05 - 04
//Створіть проєкт з класом Main.java.
//Створити клас - якась ‘невідома’ машина
//Клас має поля
//model - назва машини
//power - від 0.0 до 200.0
//speed - від 0 до 320
//price - від 0.0 до 50000.0
//yearOfManufacture  = 1967 //  для всіх один рік i оголошується лише один раз
//
//Створити 4 екземпляри машин
//Ford
//Mitsubishi
//Toyota
//KIA
//
//Створити клас - CarInfo
//Цей клас повинен вміти:
//- мати список машин які які будуть передавати на перевірку
//- мати метод який отримує якусь машину і додає її в свій список
//- мати метод який повертає найшвидшу машину
//- мати метод який повертає найдорожчу машину
//- мати метод який повертає найпотужнішу машину
//Знаходимо ці три машини - найшвидшу/найдорожчу/найпотужнішу - і  виводимо про неї всю інформацію у форматі
//
//Brand: KIA Rio
//Power: 600
//Speed: 189
//Price: 3458.90
//Year:  1967

public class Main {
    public static void main(String[] args) {

        Car ford = new Car("Ford Mustang", 335, 144, 11500);
        Car mitsubishi = new Car("Mitsubishi Minica", 21, 75, 7800);
        Car toyota = new Car("Toyota Crown", 115, 155, 14200);
        Car kia = new Car("Kia T2000", 80, 177, 8900);

        CarInfo info1 = new CarInfo();
        info1.addToInfoList(ford);
        info1.addToInfoList(toyota);
        info1.addToInfoList(kia);
        info1.addToInfoList(mitsubishi);

        System.out.println("The fastest car of list is: \n" + info1.whichIsFaster());
        System.out.println("The most powerful car of list is: \n" + info1.whichIsMorePowerful());
        System.out.println("The most expensive car of list is: \n" + info1.whichIsMoreExpensive());
    }
}
