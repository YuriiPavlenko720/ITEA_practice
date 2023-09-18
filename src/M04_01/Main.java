package M04_01;

//HW - 04 - 01
//Створіть проект з класом Main.java.
//Потрібно: Створити клас Book. Створити класи Title, Author та Content,
// кожен з яких повинен містити одне рядкове поле та метод void show().
// Реалізувати можливість додавання назви книги, імені автора та змісту.
// Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.

public class Main {
    public static void main(String[] args) {
        Book.setTitle("Історія України-Руси");
        Book.setAuthor("С.М.Грушевський");
        Book.setContent("Том I\nТом II\nТом III\nТом IV\nТом V\nТом VI\nТом VII\nТом VIII\nТом IX\nТом X");

        Title.show();
        Author.show();
        Content.show();

    }
}

class Book {
    private static String title;
    private static String author;
    private static String content;

    public static String getTitle() {
        return title;
    }

    public static String getAuthor() {
        return author;
    }

    public static String getContent() {
        return content;
    }

    public static void setTitle(String title) {
        Book.title = title;
    }

    public static void setAuthor(String author) {
        Book.author = author;
    }

    public static void setContent(String content) {
        Book.content = content;
    }
}

class Title {
    private static String title = Book.getTitle();

    public static void show(){
        System.out.println(title);
    }
}

class Author {
    private static String author = Book.getAuthor();

    public static void show(){
        System.out.println(author);
    }
}

class Content {
    private static String content = Book.getContent();

    public static void show(){
        System.out.println(content);
    }
}



