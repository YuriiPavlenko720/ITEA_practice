package M05_01;

//HW - 05 - 01
//Створіть проєкт з класом Main.java.
//Потрібно: Створити клас AbstractHandler. У тілі класу створити методи void open(), void create(), void change(), void save().
// Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
// Створити три екземпляри XMLHandler, TXTHandler, DOCHandler.
//Методи мають мати інформацію що саме за хендлер виконує роботу.
//Для прикладу
//…. xmlHandler= new XMLHandler();
//xmlHandler.open();
//В консолі буде
//XMLHandler opens a document

public class Main {
    public static void main(String[] args) {
        XMLHandler a1 = new XMLHandler();
        TXTHandler a2 = new TXTHandler();
        DOCHandler a3 = new DOCHandler();

        a1.open();
        a1.create();
        a1.change();
        a1.save();


        a2.open();
        a2.create();
        a2.change();
        a2.save();

        a3.open();
        a3.create();
        a3.change();
        a3.save();
    }
}
