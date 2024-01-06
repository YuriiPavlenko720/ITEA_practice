package HW_11_02;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

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
    @XmlAttribute
    public void setNumber(int number) {
        this.number = number;
    }

}
