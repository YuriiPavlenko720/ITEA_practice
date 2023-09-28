package M04_09;

//Створіть проект з класом Main.java.
//        Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value),
//        який виводить на екран значення аргументу. Реалізуйте можливість того, щоб у разі успадкування від даного класу інших класів,
//        та виклику відповідного методу їх екземпляра, рядки, передані як аргументи методів, виводилися різними кольорами.
//        Обовʼязково використовуйте приведення типів (Upcast / Downcast Explicitly).
public class Main {
    public static void main(String[] args) {
        Printer prnt1 = new Printer();
        Printer prnt2 = new PrinterRed();          //Upcasting
        PrinterRed prnt3 = (PrinterRed) prnt2;     //Downcasting
        Printer prnt4 = new PrinterGreen();
        PrinterGreen prnt5 = new PrinterGreen();
        PrinterGreen prnt6 = (PrinterGreen) prnt4; //Downcasting

        prnt1.print("Перший");
        prnt2.print("Другий");
        prnt3.print("Третій");
        prnt4.print("Четвертий");
        prnt5.print("П'ятий");
        prnt6.print("Шостий");
    }
}

