package HW_09_02;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calendar preDate = new GregorianCalendar();
        Calendar startDate = new GregorianCalendar(preDate.get(Calendar.YEAR), preDate.get(Calendar.MONTH), 1);
        System.out.println("Ввод дати з якої будемо рахувати часовий проміжок до теперішнього моменту.");

        int yyyy;
        int mm;
        int dd;


        try {
            //Введення року
            System.out.println("Введіть рік (від 0 до " + preDate.get(Calendar.YEAR) + " включно):");
            yyyy = scanner.nextInt();
            if (yyyy >= 0 && yyyy <= preDate.get(Calendar.YEAR)) {
                startDate.set(Calendar.YEAR, yyyy);
            } else {
                System.out.println("Введено невірний рік. Встановено поточний.");
            }

            //Введення місяця
            System.out.println("Введіть номер місяця (від 1 до 12):");
            mm = scanner.nextInt();
            if (mm > 0 && mm <= 12) {
                startDate.set(Calendar.MONTH, mm - 1);
            } else {
                System.out.println("Введено невірний місяць. Встановено поточний.");
            }

            //Введення дня
            System.out.println("Введіть номер дня з початку обраного місяця.");
            dd = scanner.nextInt();
            if (dd > 0) {
                startDate.set(Calendar.DAY_OF_MONTH, dd);
            } else {
                System.out.println("Введено невірний день. Встановено 1 число.");
            }

        } catch (Exception exception) {
            System.out.println("Введено невірні дані. Встановлено дату: " + startDate.getTime() + ".");
        }

        Calendar finDate = new GregorianCalendar();
        int years = 0;
        int months = 0;
        int days = finDate.get(Calendar.DAY_OF_MONTH) - startDate.get(Calendar.DAY_OF_MONTH);

        if (days < 0) {
            Calendar prevMonth = finDate;
            prevMonth.add(Calendar.MONTH, -1);
            days += prevMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
            months -= 1;
        }

        months = finDate.get(Calendar.MONTH) - startDate.get(Calendar.MONTH);
        if (months < 0) {
            months += 12;
            years -= 1;
        }

        years = finDate.get(Calendar.YEAR) - startDate.get(Calendar.YEAR);

        System.out.println("Часовий проміжок з введеної дати до теперішнього моменту складає: ");
        System.out.println(years + " р.,");
        System.out.println(months + " міс.,");
        System.out.println(days + " дн,");
        System.out.println(finDate.get(Calendar.HOUR_OF_DAY) + " г.,");
        System.out.println(finDate.get(Calendar.MINUTE) + " хв.,");
        System.out.println(finDate.get(Calendar.SECOND) + " с.");

        System.out.println(startDate.getTime());
        System.out.println(finDate.getTime());
    }
}
