package HW_10_05;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Tom", true, "blue", "Moon");
        System.out.println(cat);

        File catFile = new File("src/main/java/HW_10_05/cat.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(catFile));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(catFile))) {
            oos.writeObject(cat);
            oos.writeObject(cat.getLocation());

            Animal cat2 = (Animal) ois.readObject();
            cat2.setLocation((String) ois.readObject());
            System.out.println(cat2);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
