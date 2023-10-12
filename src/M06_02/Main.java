package M06_02;

import M06_01.Animal;
import M06_01.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo02 = new Zoo();

        zoo02.animals.add(new Animal("Bear"));
        zoo02.animals.add(new Animal("Lion"));
        zoo02.animals.add(new Animal("Tiger"));
        zoo02.animals.add(new Animal("Elephant"));
        zoo02.animals.add(new Animal("Giraffe"));
        zoo02.animals.add(new Animal("Wolf"));
        zoo02.animals.add(new Animal("Fox"));
        zoo02.animals.add(new Animal("Crocodile"));

        zoo02.animals.remove(2); //видалення 3 тварини первісного списку
        zoo02.animals.remove(3); //видалення 5 тварини первісного списку
        zoo02.animals.remove(4); //видалення 7 тварини первісного списку

        System.out.println(zoo02.animals.size());
    }
}
