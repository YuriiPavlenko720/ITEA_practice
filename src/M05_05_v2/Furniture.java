package M05_05_v2;

public interface Furniture {


    String getName();

    String getStyle();

    String getModel();

    void setModel(String model);

    void setStyle(String style);

    double getPrice();

    void setPrice(double price);

    @Override
    String toString();
}
