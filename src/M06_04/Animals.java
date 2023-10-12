package M06_04;

public enum Animals {
    HORSE(5),
    DOG(6),
    CAT(4),
    DUCK(1);

    int age;


    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "Тварина{" +
                "Назва: " + name() +
                ", Вік = " + age +
                "р." +
                '}';
    }
}
