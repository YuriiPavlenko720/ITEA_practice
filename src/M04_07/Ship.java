package M04_07;

public class Ship extends Vehicle{
    private int number;
    private String port;

    public Ship(String name, double x, double y, double speed, double price, int year, int number, String port) {
        super(name, x, y, speed, price, year);
        this.number = number;
        this.port = port;
    }

    public Ship() {
        super("unknown ship", 0, 0, 0, 0, 1900);
        this.number = 0;
        this.port = "no home port";
    }

    public void info(){
        System.out.println("Судно: " + getName() + ".");
        System.out.println("Порт приписки: м. " + getPort() + ".");
        System.out.println("Координати: Х = " + getX() + "м., Y = " + getY() + "м.");
        System.out.println("Швидкість: " + getSpeed() / 1.852 + " вузл.");
        System.out.println("Ціна: " + getPrice() + "$");
        System.out.println("Випуск: " + getYear() + "р.");
        System.out.println("Кількість пасажирів: " + getNumber() + ".");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
