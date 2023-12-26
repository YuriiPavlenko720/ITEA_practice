package HW_09_05;

public class Animal {
    private String name = "no name";
    public boolean real = false;
    protected String color = "no color";
    final String NUTRITION = "Heterotroph";
    public static short legs = 4;
    public static final String REGNUM = "Animalia";
    private static String location = "Earth";
    private static final String DOMEN = "Eukaryota";

    public static String getDomen() {
        return DOMEN;
    }

    public static String getLocation() {
        return location;
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
                "\u001B[32m" + ", domen='" + getDomen() + '\'' +
                "\u001B[34m" + ", location='" + getLocation() + '\'' + "\u001B[0m" +
                '}';
    }
}
