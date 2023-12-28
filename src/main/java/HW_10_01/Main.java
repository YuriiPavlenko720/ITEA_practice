package HW_10_01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Програма дозволяє розробнику легко доповнювати калькулятор додатковими операціями (ступінь, корінь і т.п.
 * без кропіткої зміни коду в main (тобто без влізання при редагуванні в if або switch і т.п.).
 * Розробнику достатньо лише додати нову функцію в клас Calculator з відповідними анотаціями, а main вже сам "підхватить".
*/
public class Main {
    public static void main(String[] args) {

        /**
         * Складання масиву ключ-значення де ключ - введена команда (з врахуванням синонімів, а значення - відповідний метод.
         */
        Map<String, Method> operations = new HashMap<>();
        Calculator calculator = new Calculator();

        for (Method mtd : calculator.getClass().getDeclaredMethods()) {
            if (mtd.isAnnotationPresent(Calculate.class)) {
                Calculate command = mtd.getAnnotation(Calculate.class);
                operations.put(command.operation(), mtd);

                for (String cmd : command.aliases()) {
                    operations.put(cmd, mtd);
                }
            }
        }

        /**
         * Введення даних обчислення
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        int A = scanner.nextInt();
        System.out.println("Введіть друге число: ");
        int B = scanner.nextInt();
        System.out.println("Що треба зробити з числами?: ");
        String operation = scanner.next();


        /**
         * Виклик відповідного методу з калькулятора
         */


        try {
            Method method = operations.get(operation);
            if (method == null) {
                System.out.println("Операція відсуня");
            } else {
                method.invoke(calculator, A, B);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
