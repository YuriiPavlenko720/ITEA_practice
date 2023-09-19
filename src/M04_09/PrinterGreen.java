package M04_09;

public class PrinterGreen extends Printer{
    final String COLOR = "\u001B[32m";
    final String RESET = "\u001B[0m";
    void print(String value) {
        System.out.println(COLOR + value + RESET);
    }
}
