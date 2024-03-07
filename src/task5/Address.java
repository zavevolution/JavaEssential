package task5;

public class Address {
    private int index;
    private String country;
    private String sity;
    private String street;
    private int house;
    private int apartment;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}

class TestAddress {
    public static void main(String[] args) {
        Address adr = new Address();
        adr.setIndex(457689);
        adr.setCountry("Italy");
        adr.setSity("Roma");
        adr.setStreet("via F.Petrarca");
        adr.setHouse(144);
        adr.setApartment(32);

        System.out.println("Поштова адресса:");
        System.out.println("Індекс " + adr.getIndex());
        System.out.println("Країна " + adr.getCountry());
        System.out.println("Місто " + adr.getSity());
        System.out.println("Вулиця " + adr.getStreet());
        System.out.println("Будинок " + adr.getHouse());
        System.out.println("Квартира " + adr.getApartment());
    }
}
