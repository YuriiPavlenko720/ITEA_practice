package M06_01;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this.name = "unknown animal";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
