package HW_10_02;

public class Square extends Polygon{

    private String color;
    private final short angles = 4;

    public Square(String color) {
        this.color = color;
    }

    public Square() {
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
        return "Square{" +
                "color='" + color + '\'' +
                ", angles=" + angles +
                '}';
    }
}
