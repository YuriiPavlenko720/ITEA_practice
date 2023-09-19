package M04_06;

public class ExcelentPupil extends Pupil {

    public ExcelentPupil(String name) {
        this.setName(name);
    }

    public ExcelentPupil() {
        this.setName("no name");
    }

    @Override
    void study() {
        System.out.println("Вміє добре навчатися");
    }

    @Override
    void read() {
        System.out.println("Вміє добре читати");
    }

    @Override
    void write() {
        System.out.println("Вміє добре писати");
    }

    @Override
    void relax() {
        System.out.println("Вміє добре відпочивати");
    }
}
