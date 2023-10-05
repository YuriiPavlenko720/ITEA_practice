package M05_05;

public abstract class Furniture {

    public abstract String getName();

    public abstract String getModel();

    public abstract void setModel(String model);

    public abstract double getPrice();

    public abstract void setPrice(double price);

    @Override
    public abstract String toString();
}
