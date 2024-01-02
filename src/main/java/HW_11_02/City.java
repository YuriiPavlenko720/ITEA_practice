package HW_11_02;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "city")
public class City {

    private String name;
    private String size;
    private List<Street> streets;

    public City(String name, String size, List<Street> streets) {
        this.name = name;
        this.size = size;
        this.streets = streets;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "city")
    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    @XmlAttribute(name = "size")
    public void setSize(String size) {
        this.size = size;
    }

    public List<Street> getStreets() {
        return streets;
    }

    @XmlElement(name = "street")
    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }
}
