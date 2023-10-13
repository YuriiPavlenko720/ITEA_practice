package M06_05;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введіть дані п'ятьох робітників.");

        ArrayList<Worker> list01 = new ArrayList<>(5);

        LocalDateTime dateNow = LocalDateTime.now();

        for (int i = 0; i < 5; i++) {

            Worker worker = new Worker();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введть призвище та ініціали " + (i + 1) + " робітника: ");
            worker.setName(scanner.nextLine());
            System.out.print("Введть посаду " + (i + 1) + " робітника: ");
            worker.setPosition(scanner.nextLine());
            System.out.print("Введть рік надходження на роботу " + (i + 1) + " робітника: ");

            int inputYear = scanner.nextInt();
            if (inputYear < 2000) {
                throw new ArithmeticException("Працівник не міг працювати раніше року створення компанії");
            } else if (inputYear > dateNow.getYear()) {
                throw new ArithmeticException("Працівник не може бути прийнятий пізніше за поточний рік (" + dateNow.getYear() + "р.)");
            } else {
                worker.setYearOfEmp(inputYear);
            }

            list01.add(worker);

        }

        Comparator<Worker> comparator = Comparator.comparing(obj -> obj.getName().toLowerCase());
        list01.sort(comparator);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введть граничний стаж: ");
        int inputExp = scanner.nextInt();

        ArrayList<String> listExp = new ArrayList<>();

        for (Worker worker : list01) {
            if (dateNow.getYear() - worker.getYearOfEmp() >= inputExp) {
                listExp.add(worker.getName());
            }
        }
        System.out.print("Робітники стаж яких більше за " + inputExp + " років:");
        System.out.println(listExp);
    }
}
