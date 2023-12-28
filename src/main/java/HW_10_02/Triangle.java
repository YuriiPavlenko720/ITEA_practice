package HW_10_02;

public class Triangle extends Polygon{
    private String color;
    private final short angles = 3;

    public Triangle(String color) {
        this.color = color;
    }

    public Triangle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                ", angles=" + angles +
                '}';
    }
}
