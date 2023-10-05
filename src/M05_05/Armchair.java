package M05_05;

public class Armchair extends Furniture{
    private final String name = "Крісло";
    private String model;
    private double price;

    public Armchair(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public Armchair() {
        this.model = "unknown model";
        this.price = 0.00;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - \"" + model + "\", " + price + " грн.";
    }
}
