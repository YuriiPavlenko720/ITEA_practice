package HW_12_03;

public class Main {
    public static void main(String[] args) {
        Calculate add = (a, b) -> System.out.println(a + b);
        Calculate sub = (a, b) -> System.out.println(a - b);
        Calculate mul = (a, b) -> System.out.println(a * b);
        Calculate div = (a, b) -> { if (b == 0) {System.out.println("ділення на нуль");} else { System.out.println(a / b);}};
        Calculate exp = (a, b) -> System.out.println(Math.pow(a, b));
        Calculate ert = (a, b) -> System.out.println(Math.pow(a, 1 / b));

        add.operation(2, 3);
        sub.operation(10, 5);
        mul.operation(4, 5);
        div.operation(100, 10);
        exp.operation(2, 5);
        ert.operation(81, 4);
    }
}
