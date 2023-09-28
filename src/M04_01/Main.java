package M04_01;

//HW - 04 - 01
//Створіть проект з класом Main.java.
//Потрібно: Створити клас Book. Створити класи Title, Author та Content,
// кожен з яких повинен містити одне рядкове поле та метод void show().
// Реалізувати можливість додавання назви книги, імені автора та змісту.
// Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.

public class Main {
    public static void main(String[] args) {

        Title title1 = new Title("Історія України-Руси");
        Author author1 = new Author("С.М.Грушевський");
        Content content1 = new Content("Том I\nТом II\nТом III\nТом IV\nТом V\nТом VI\nТом VII\nТом VIII\nТом IX\nТом X");

        Book book1 = new Book(title1, author1, content1);

        title1.show();
        author1.show();
        content1.show();
        System.out.println("\n");
        book1.show();
    }
}



