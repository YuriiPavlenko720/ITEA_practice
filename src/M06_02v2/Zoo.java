package M06_02v2;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<String> animals = new ArrayList<>();

    public void printInfo(){
        System.out.println(animals);
    }

    public static void main(String[] args) {
        Zoo zoo01 = new Zoo();
        zoo01.animals.add(0, "Bear");
        zoo01.animals.add(1, "Lion");
        zoo01.animals.add(2, "Tiger");
        zoo01.animals.add(3, "Elephant");
        zoo01.animals.add(4, "Giraffe");
        zoo01.animals.add(5, "Wolf");
        zoo01.animals.add(6, "Fox");
        zoo01.animals.add(7, "Crocodile");

        zoo01.printInfo();
        zoo01.animals.remove(3);
        zoo01.animals.remove(4);
        zoo01.animals.remove(5);
        zoo01.printInfo();
    }
}
