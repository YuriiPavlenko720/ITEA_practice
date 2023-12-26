package HW_09_05;

public class Cat extends Animal{
    private String name = "Tom";
    public boolean real = true;
    protected String color = "blue";
    final String NUTRITION = "predator";

    public Cat() {
    }


    @Override
    public String toString() {
        return "Cat{" +
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
