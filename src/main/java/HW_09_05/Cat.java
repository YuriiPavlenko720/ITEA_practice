package HW_09_05;

public class Cat extends Animal{
    private String name = "no name";
    public boolean live = true;
    protected String color = "no color";
    final String nutrition = "predator";

    public Cat() {
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isLive() {
        return live;
    }

    @Override
    public void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getNutrition() {
        return nutrition;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", live=" + live +
                ", color='" + color + '\'' +
                ", nutrition='" + nutrition + '\'' +
                '}';
    }
}
