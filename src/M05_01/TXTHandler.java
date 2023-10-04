package M05_01;

public class TXTHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("TXTHandler opens a document");
    }

    @Override
    void create() {
        System.out.println("TXTHandler creates a document");
    }

    @Override
    void change() {
        System.out.println("TXTHandler changes a document");
    }

    @Override
    void save() {
        System.out.println("TXTHandler saves a document");
    }
}
