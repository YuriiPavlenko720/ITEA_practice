package M05_01;

public class XMLHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("XMLHandler opens a document");
    }

    @Override
    void create() {
        System.out.println("XMLHandler creates a document");
    }

    @Override
    void change() {
        System.out.println("XMLHandler changes a document");
    }

    @Override
    void save() {
        System.out.println("XMLHandler saves a document");
    }
}
