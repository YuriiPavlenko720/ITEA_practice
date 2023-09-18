package M04_05;

//HW - 04 - 05
//        Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
//        який повинен приймати радіус та використовуючи PI порахувати площу кола і виводить результат в консоль.
//        Створити клас Main, де запустити цей метод.


class MyArea {
    static final double PI = 3.14;

    static void areaOfCircle(double radius) {
        System.out.println(PI * Math.pow(radius, 2));
    }
}
public class Main {
    public static void main(String[] args) {
        double r = 8.0;
        MyArea.areaOfCircle(r);
    }
}
