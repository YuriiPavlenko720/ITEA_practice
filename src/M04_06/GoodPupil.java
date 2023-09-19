package M04_06;

public class GoodPupil extends Pupil {

    public GoodPupil(String name) {
        this.setName(name);
    }

    public GoodPupil() {
        this.setName("no name");
    }

    @Override
    void study() {
        System.out.println("Не вміє добре навчатися");
    }

    @Override
    void read() {
        System.out.println("Може добре читати");
    }

    @Override
    void write() {
        System.out.println("Може добре писати");
    }

    @Override
    void relax() {
        System.out.println("Може добре відпочивати");
    }
}
