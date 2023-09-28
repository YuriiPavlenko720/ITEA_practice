package M04_06;

//Створіть проект з класом Main.java.
//        Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
//        У тілі класу створіть методи void study(), void read(), void write(), void relax().
//        Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil
//        і перевизначте кожен із методів, залежно від успішності учня.
//        Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися з 4 учнів.
//        Передбачте можливість, що користувач може передати 2 або 3 аргументи.
//        Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.

public class Main {
    public static void main(String[] args) {
        Pupil p1 = new ExcelentPupil("Петро");
        Pupil p2 = new BadPupil("Микола");
        Pupil p3 = new BadPupil("Іван");
        Pupil p4 = new GoodPupil("Оксана");
        Pupil p5 = new ExcelentPupil("Мотря");
        Pupil p6 = new GoodPupil("Михайло");
        Pupil p7 = new GoodPupil("Марія");
        Pupil p8 = new GoodPupil("Кирило");
        Pupil p9 = new ExcelentPupil("Микита");

        ClassRoom class1 = new ClassRoom(p1, p3, p4, p9);
        ClassRoom class2 = new ClassRoom(p2, p7, p8);
        ClassRoom class3 = new ClassRoom(p5, p6);

        System.out.println("Клас №1: ");
        classInfo(class1);
        System.out.println("\n");

        System.out.println("Клас №2: ");
        classInfo(class2);
        System.out.println("\n");

        System.out.println("Клас №3: ");
        classInfo(class3);
        System.out.println("\n");

    }

    public static void classInfo (ClassRoom room){
        for (int i = 0; i < room.list.length; i++) {

            System.out.println(i + 1 + ". " + room.list[i].getName() + ": ");
            room.list[i].study();
            room.list[i].read();
            room.list[i].write();
            room.list[i].relax();
        }
    }
}

