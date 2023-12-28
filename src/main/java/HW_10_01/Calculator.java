package HW_10_01;

public class Calculator {

    /**
     Робочий клас калькулятора для додавання нових функцій роботи з двома числами.
     Увага! Відповідні анотації обов'язкові.
     */

    @Calculate(operation = "add", aliases = {"plus", "+", "додати", "плюс"})
    public void add (int A, int B) {
        System.out.println("Відповідь: " + A + " + " + B + " = " + (A + B));
    }

    @Calculate(operation = "subtract", aliases = {"minus", "-", "відняти", "мінус"})
    public void sub (int A, int B) {
        System.out.println("Відповідь: " + A + " - " + B + " = " + (A - B));
    }

    @Calculate(operation = "division", aliases = {"divide", "/", "ділити", "поділити"})
    public void div (int A, int B) {
        if (B != 0) {
            System.out.println("Відповідь: " + A + " / " + B + " = " + ((double) A / B));
        } else {
            System.out.println("Ділення на 0 заборонено.");
        }
    }

    @Calculate(operation = "multiplication", aliases = {"multiply", "*", "множити", "помножити", "множення"})
    public void mul (int A, int B) {
        System.out.println("Відповідь: " + A + " * " + B + " = " + (A * B));
    }
}
