package M04_06;

public class Pupil {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pupil(String name) {
        this.name = name;
    }

    public Pupil() {
        this.name = "no name";
    }

    void study(){
        System.out.println("Учень має вміти навчатися.");
    }
    void read(){
        System.out.println("Учень має вміти читати");
    } void write(){
        System.out.println("Учень має вміти писати");
    } void relax(){
        System.out.println("Учень має вміти відпочивати");
    }
}
