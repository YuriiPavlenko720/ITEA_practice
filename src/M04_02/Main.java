package M04_02;

//HW - 04 - 02
//Створіть проект з класом Main.java.
//Потрібно: Створити клас  Address. У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
// Для кожного поля створити метод з двома методами доступу (get, set) Створити екземпляр класу Address.
// У поля экземпляра записати інформацію. Виведіть на екран значення полів, що описують адресу.


public class Main {
    public static void main(String[] args) {

        Address adr1 = new Address();
        adr1.setIndex("A2111");
        adr1.setCountry("Ukraine");
        adr1.setCity("Kyiv");
        adr1.setStreet("Peremogy");
        adr1.setHouse("25-A");
        adr1.setApartment("K277");

        System.out.println("Індекс: " + adr1.getIndex());
        System.out.println("Країна: " + adr1.getCountry());
        System.out.println("Місто: " + adr1.getCity());
        System.out.println("Вулиця: " + adr1.getStreet());
        System.out.println("Будинок: " + adr1.getHouse());
        System.out.println("Квартира: " + adr1.getApartment());

    }
}

class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getApartment() {
        return apartment;
    }
}


