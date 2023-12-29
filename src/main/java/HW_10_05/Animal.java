package HW_10_05;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name = "no name";
    public boolean real = false;
    protected String color = "no color";
    final String NUTRITION = "Heterotroph";
    public static short legs = 4;
    public static final String REGNUM = "Animalia";
    private transient String location = "Earth";
    private static final String DOMEN = "Eukaryota";

    public Animal(String name, boolean real, String color, String location) {
        this.name = name;
        this.real = real;
        this.color = color;
        this.location = location;
    }

    public Animal() {
    }

    public static String getDomen() {
        return DOMEN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReal() {
        return real;
    }

    public void setReal(boolean real) {
        this.real = real;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNUTRITION() {
        return NUTRITION;
    }

    public static short getLegs() {
        return legs;
    }

    public static void setLegs(short legs) {
        Animal.legs = legs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "\u001B[32m" + "name='" + name + '\'' +
                "\u001B[33m" + ", is real=" + real +
                "\u001B[31m" + ", color='" + color + '\'' +
                "\u001B[34m" + ", nutrition='" + NUTRITION + '\'' +
                "\u001B[36m" + ", num of legs='" + legs + '\'' +
                "\u001B[35m" + ", regnum='" + REGNUM + '\'' +
                "\u001B[32m" + ", domen='" + DOMEN + '\'' +
                "\u001B[34m" + ", location='" + location + '\'' + "\u001B[0m" +
                '}';
    }
}
