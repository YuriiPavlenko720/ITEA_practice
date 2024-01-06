package HW_11_02;

import com.sun.xml.txw2.annotation.XmlCDATA;
import com.sun.xml.txw2.annotation.XmlNamespace;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.util.List;

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
    @XmlElement
public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    @XmlAttribute
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
