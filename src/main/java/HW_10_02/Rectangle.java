package HW_10_02;

public class Rectangle extends Polygon{
    private String color;
    private final short angles = 4;

    public Rectangle(String color) {
        this.color = color;
    }

    public Rectangle() {
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
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", angles=" + angles +
                '}';
    }
}
