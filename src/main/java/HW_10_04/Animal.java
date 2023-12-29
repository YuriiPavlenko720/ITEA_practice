package HW_10_04;

import java.io.Serializable;

public class Animal implements Serializable {
    String name = "no name";
    public boolean real = false;
    protected String color = "no color";
    final String NUTRITION = "Heterotroph";
    public static short legs = 4;
    public static final String REGNUM = "Animalia";

    public Animal(String name, boolean real, String color) {
        this.name = name;
        this.real = real;
        this.color = color;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "\u001B[32m" + "name='" + name + '\'' +
                "\u001B[33m" + ", is real=" + real +
                "\u001B[31m" + ", color='" + color + '\'' +
                "\u001B[34m" + ", nutrition='" + NUTRITION + '\'' +
                "\u001B[36m" + ", num of legs='" + legs + '\'' +
                "\u001B[35m" + ", regnum='" + REGNUM + '\'' + "\u001B[0m" +
                '}';
    }
}
