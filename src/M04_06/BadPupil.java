package M04_06;

public class BadPupil extends Pupil {

    public BadPupil(String name) {
        this.setName(name);
    }

    public BadPupil() {
        this.setName("no name");
    }

    @Override
    void study() {
        System.out.println("Не вміє навчатися");
    }

    @Override
    void read() {
        System.out.println("Не завжди добре читає");
    }

    @Override
    void write() {
        System.out.println("Не завжди добре пише");
    }

    @Override
    void relax() {
        System.out.println("Може погано відпочивати");
    }
}
