package M05_05_v2;

public class Table implements Furniture{
    private final String name = "Столик";
    private String style;
    private String model;
    private double price;

    public Table(String style, String model, double price) {
        this.style = style;
        this.model = model;
        this.price = price;
    }

    public Table() {
        this.style = "unknown style";
        this.model = "unknown model";
        this.price = 0.00;
    }

    @Override
    public String getName() {
        return null;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + " - \"" + model + "\", " + price + " грн.";
    }
}
