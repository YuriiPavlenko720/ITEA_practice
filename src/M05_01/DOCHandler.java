package M05_01;

public class DOCHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("DOCHandler opens a document");
    }

    @Override
    void create() {
        System.out.println("DOCHandler creates a document");
    }

    @Override
    void change() {
        System.out.println("DOCHandler changes a document");
    }

    @Override
    void save() {
        System.out.println("DOCHandler saves a document");
    }
}
