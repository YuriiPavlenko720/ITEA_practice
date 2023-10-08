package M05_05_v2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Який варіант набору Ви хотіли б придбати ?");
        System.out.println("1 -> Ар-деко");
        System.out.println("2 -> Вікторіанській");
        System.out.println("3 -> Модерн");
        System.out.println("------------------");

        Factory primeFactory = null;
        int set = scanner.nextInt();
        System.out.println("Ви вибрали варіант: " + set);

        switch (set) {
            case 1:
                primeFactory = new ArDecoFactory();
                break;
            case 2:
                primeFactory = new VictorianFactory();
                break;
            case 3:
                primeFactory = new ModernFactory();
                break;
            default:
                System.out.println("Невірний ввод");
        }

        if (primeFactory != null) {
            primeFactory.createBatch();
            Store.storedBatchInfo();
        } else {
            System.out.println("Помилка вибору набору");
        }
    }
}
