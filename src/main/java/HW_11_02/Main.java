package HW_11_02;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Number> numbers1 = new ArrayList<>();
        numbers1.add(new Number(1));
        numbers1.add(new Number(2));
        numbers1.add(new Number(3));

        List<Number> numbers2 = new ArrayList<>();
        numbers1.add(new Number(1));
        numbers1.add(new Number(2));
        numbers1.add(new Number(3));

        Street khreshatyk = new Street("Khreshatyk", numbers1);
        Street kyrylivska = new Street("Kyrylivska", numbers2);

        List<Street> streets1 = new ArrayList<>();
        streets1.add(khreshatyk);
        streets1.add(kyrylivska);
        City kyiv = new City("Kyiv", "big", streets1);

        List<Number> numbers3 = new ArrayList<>();
        numbers3.add(new Number(1));
        numbers3.add(new Number(2));

        Street kyivska = new Street("Kyivska", numbers3);

        List<Street> streets2 = new ArrayList<>();
        streets2.add(kyivska);
        City brovary = new City("Brovary", "small", streets2);

        List<City> cities = new ArrayList<>();
        cities.add(kyiv);
        cities.add(brovary);
        AddressBook catalog = new AddressBook(cities);

        try {
            File fileXML = new File("src/main/java/HW_11_02/addressesJAXB.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(AddressBook.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(catalog, fileXML);


        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }
}
