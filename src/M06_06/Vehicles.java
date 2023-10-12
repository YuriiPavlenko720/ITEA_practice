package M06_06;

public enum Vehicles {
    BMW(50000),
    AUDI(60000),
    TOYOTA(40000),
    NISSAN(35000);

    String color;
    int price;


    Vehicles(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return "Машина{" +
                "Назва: " + name() +
                ", Ціна = " + price +
                "$, Колір = '" + color + '\'' +
                '}';
    }
}
