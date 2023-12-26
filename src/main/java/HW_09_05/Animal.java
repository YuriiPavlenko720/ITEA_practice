package HW_09_05;

public class Animal {
    private String name = "no name";
    public boolean live = false;
    protected String color = "no color";
    final String nutrition = "Heterotroph";
    public static short legs = 4;
    public static final String REGNUM = "Animalia";
    private static String location = "Earth";
    private static final String DOMEN = "Eukaryota";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNutrition() {
        return nutrition;
    }

    public static short getLegs() {
        return legs;
    }

    public static void setLegs(short legs) {
        Animal.legs = legs;
    }

    public static String getLocation() {
        return location;
    }

    public static void setLocation(String location) {
        Animal.location = location;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", live=" + live +
                ", color='" + color + '\'' +
                ", nutrition='" + nutrition + '\'' +
                '}';
    }
}
