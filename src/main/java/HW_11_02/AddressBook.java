package HW_11_02;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "")
@XmlType(propOrder = { "cities" })
public class AddressBook {
    private List<City> cities;

    public AddressBook(List<City> cities) {
        this.cities = cities;
    }

    public AddressBook() {
    }

    public List<City> getCities() {
        return cities;
    }
    @XmlElement(name = "city")
    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
