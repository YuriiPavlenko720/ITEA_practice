package HW_10_02;

public class Polygon extends Shape{
    private String color;
    private short angles;

    public Polygon() {
    }

    public Polygon(String color, short angles) {
        this.color = color;
        this.angles = angles;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getAngles() {
        return angles;
    }

    public void setAngles(short angles) {
        this.angles = angles;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "color='" + color + '\'' +
                ", angles=" + angles +
                '}';
    }
}
