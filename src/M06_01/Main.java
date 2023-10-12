package M06_01;

public class Main {
    public static void main(String[] args) {
        Zoo zoo01 = new Zoo();
        zoo01.animals.add(new Animal("Bear"));
        zoo01.animals.add(new Animal("Lion"));
        zoo01.animals.add(new Animal("Tiger"));
        zoo01.animals.add(new Animal("Elephant"));
        zoo01.animals.add(new Animal("Giraffe"));
        zoo01.animals.add(new Animal("Wolf"));
        zoo01.animals.add(new Animal("Fox"));
        zoo01.animals.add(new Animal("Crocodile"));

        zoo01.printInfo();
    }
}
