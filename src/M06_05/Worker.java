package M06_05;

public class Worker {
    private String name;
    private String position;
    private int yearOfEmp;

    public Worker(String name, String position, int yearOfEmp) {
        this.name = name;
        this.position = position;
        this.yearOfEmp = yearOfEmp;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYearOfEmp() {
        return yearOfEmp;
    }

    public void setYearOfEmp(int yearOfEmp) {
        this.yearOfEmp = yearOfEmp;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", yearOfEmp=" + yearOfEmp +
                '}';
    }
}
