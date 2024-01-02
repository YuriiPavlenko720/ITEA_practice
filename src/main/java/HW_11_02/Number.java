package HW_11_02;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "number")
public class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public Number() {
    }

    public int getNumber() {
        return number;
    }

    @XmlElement(name = "number")
    public void setNumber(int number) {
        this.number = number;
    }

}
