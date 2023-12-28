package HW_10_02;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        System.out.println(circle1);
        System.out.println(circle1.getClass().getAnnotation(Color.class));
        System.out.println(circle1.getClass().getAnnotation(Angles.class));
        Shape square1 = new Square();
        System.out.println(square1);
        System.out.println(square1.getClass().getAnnotation(Color.class));
        System.out.println(square1.getClass().getAnnotation(Angles.class));
    }
}
