package HW_11_02;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "street")
public class Street {
    private String name;
    private List<Number> numbers;

    public Street(String name, List<Number> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public Street() {
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "street")
    public void setName(String name) {
        this.name = name;
    }

    public List<Number> getNumbers() {
        return numbers;
    }

    @XmlElement(name = "number")
    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }
}
