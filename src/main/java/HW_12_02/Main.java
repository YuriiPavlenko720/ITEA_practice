package HW_12_02;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Енеїда", "Котляревський І.П.", 201);
        printBookInfo(book1);
        printBookInfo(new Book("Кобзар", "Шевченко Т.Г.", 389) {
        });


        PrintInfo lambdaPrint = book -> System.out.println(book.getAuthor() + " - " + book.getName() + " - " + book.getPages() + "с. LAMBDA.");
        lambdaPrint.printBookInfo(book1);
        lambdaPrint.printBookInfo(new Book("Кобзар", "Шевченко Т.Г.", 389));
    }

    public static void printBookInfo(Book book) {
        System.out.println(book.getAuthor() + " - " + book.getName() + " - " + book.getPages() + "с. NO Lambda.");
    }
}
