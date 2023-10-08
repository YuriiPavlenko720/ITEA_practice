package M05_05_v2;

public class Table implements Furniture{

    private String model;
    private double price;

    public Table(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public Table() {
        this.model = "unknown model";
        this.price = 0.00;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return model + ", " + price + " грн.";
    }
}
