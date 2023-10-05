package M05_05;

//HW - 05 - 05
//Створіть проєкт з класом Main.java.
//Створити програму яка буде описувати виробництво меблів на фабриці.
//У нас будуть три варіанта меблів - Ар-деко, Вікторіанській і Модерн.
//Фабрика вміє виробляти - Крісло, Диван, Столик.
//Крісло, Диван, Столик - мають мати ціну - X.X, назву - "XXX".
//
//Спроектувати програму таким чином, щоб користувач міг вибрати який варіант меблів він хоче отримати і фабрика це зробила.
// Після вибору він отримав докладний звіт.
//Також передбачити умову - якщо у нас зʼявляється новий виріб - наприклад Поличка то фабрика яка виробляє
// конкретний тип меблів була зобовʼязана провести адаптацію і могла працювати далі.
//
//Наприклад
//------------------
//Який варіант набору Ви хотіли б придбати ?
//1 -> Ар-деко
//2 -> Вікторіанській
//3 -> Модерн
//------------------
//Ви обрали варіант: 2
//Детальний опис:
//Крісло - "Тиха гавань", 2340 грн.
//Диван - "Мудрість віків", 7340.57 грн.
//Столик - "Місце роздумів", 4340 грн.
//Загальна сума: 14020.57 грн.
//
//------------------
//Який варіант набору Ви хотіли б придбати ?
//1 -> Ар-деко
//2 -> Вікторіанській
//3 -> Модерн
//------------------
//Ви обрали варіант: 3
//Детальний опис:
//Крісло - "Стар шіп", 1340 грн.
//Диван - "Гіпер портал", 5340.17 грн.
//Столик - "Пульт керування", 4340 грн.
//Загальна сума: 11020.17 грн.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Armchair armchair01 = new Armchair("Осіння тиша", 1830);
        Armchair armchair02 = new Armchair("Тиха гавань", 2340);
        Armchair armchair03 = new Armchair("Стар шіп", 1340);

        Sofa sofa01 = new Sofa("Вечірній шторм", 4480);
        Sofa sofa02 = new Sofa("Мудрість віків", 7340.57);
        Sofa sofa03 = new Sofa("Гіпер портал", 5340.17);

        Table table01 = new Table("Волошкове поле", 3200.22);
        Table table02 = new Table("Місце роздумів", 4340);
        Table table03 = new Table("Пульт керування", 4340);


        StyleInfo arDeco = new StyleInfo();
        arDeco.addToFormList(armchair01);
        arDeco.addToFormList(sofa01);
        arDeco.addToFormList(table01);

        StyleInfo victorian = new StyleInfo();
        victorian.addToFormList(armchair02);
        victorian.addToFormList(sofa02);
        victorian.addToFormList(table02);

        StyleInfo modern = new StyleInfo();
        modern.addToFormList(armchair03);
        modern.addToFormList(sofa03);
        modern.addToFormList(table03);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Який варіант набору Ви хотіли б придбати ?");
        System.out.println("1 -> Ар-деко");
        System.out.println("2 -> Вікторіанській");
        System.out.println("3 -> Модерн");
        System.out.println("------------------");

        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Ви вибрали варіант: 1");
                arDeco.printFormList();
                break;
            case 2:
                System.out.println("Ви вибрали варіант: 2");
                victorian.printFormList();
                break;
            case 3:
                System.out.println("Ви вибрали варіант: 3");
                modern.printFormList();
                break;
            default:
                System.out.println("Невірний ввод");
        }
    }
}
