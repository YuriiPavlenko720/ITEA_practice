package HW_10_02;

@Angles
@Color
public class Shape {
    private String color;
    private short angles;

    public Shape(String color, short angles) {
        this.color = color;
        this.angles = angles;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", angles=" + angles +
                '}';
    }
}
