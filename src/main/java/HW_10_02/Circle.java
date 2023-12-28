package HW_10_02;

public class Circle extends Shape{
    private String color;
    private final short angles = 0;

    public Circle() {
    }

    public Circle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", angles=" + angles +
                '}';
    }
}
