package HW_11_01;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        File fileXML = new File("src/main/java/HW_11_01/addresses.xml");
        XMLOutputFactory outputXML = XMLOutputFactory.newInstance();
        try {
            XMLStreamWriter writeXML = outputXML.createXMLStreamWriter(new FileOutputStream(fileXML));
            writeXML.writeStartDocument("addresses");
            writeXML.writeStartElement("addressBook");
            writeXML.writeStartElement("city");
            writeXML.writeAttribute("size", "big");
            writeXML.writeCharacters("Kyiv");
            writeXML.writeStartElement("street");
            writeXML.writeCharacters("Khreshatik");
            writeXML.writeStartElement("number");
            writeXML.writeCharacters("1");
            writeXML.writeEndElement();
            writeXML.writeStartElement("number");
            writeXML.writeCharacters("2");
            writeXML.writeEndElement();
            writeXML.writeStartElement("number");
            writeXML.writeCharacters("3");
            writeXML.writeEndElement();
            writeXML.writeEndElement();
            writeXML.writeStartElement("street");
            writeXML.writeCharacters("Kyrylivska");
            writeXML.writeStartElement("number");
            writeXML.writeCharacters("1");
            writeXML.writeEndElement();
            writeXML.writeStartElement("number");
            writeXML.writeCharacters("2");
            writeXML.writeEndElement();
            writeXML.writeStartElement("number");
            writeXML.writeCharacters("3");
            writeXML.writeEndElement();
            writeXML.writeEndElement();
            writeXML.writeEndElement();
            writeXML.writeStartElement("city");
            writeXML.writeAttribute("size", "small");
            writeXML.writeCharacters("Brovary");
            writeXML.writeStartElement("street");
            writeXML.writeCharacters("Kyivska");
            writeXML.writeStartElement("number");
            writeXML.writeCharacters("1");
            writeXML.writeEndElement();
            writeXML.writeStartElement("number");
            writeXML.writeCharacters("2");
            writeXML.writeEndDocument();

        } catch (XMLStreamException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
