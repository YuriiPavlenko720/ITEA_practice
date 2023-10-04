package M05_03;

// HW - 05 - 03
//Створіть проєкт з класом Main.java.
//Створіть ConverterTemperature з методом convert.
//Реалізуйте для ConverterTemperature класи для конвертації з градусів за Цельсієм в Кельвіни, Фаренгейти.
//У класу має бути метод convert, який робить конвертацію.
//Інстанс ConverterTemperature створити неможливо.

public class Main {

    public static void main(String[] args) {
        CelsToFar converting1 = new CelsToFar();
        CelsToKel converting2 = new CelsToKel();

        double c = 36.6;
        System.out.println(c + "°C дорівнює " + converting1.convert(c) + "°F , або " + converting2.convert(c) + "K.");

        //ConverterTemperature converting3 = new ConverterTemperature(); // - Неможливо створити екземпляр інтерфейсу.

    }
}
