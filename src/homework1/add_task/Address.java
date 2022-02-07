package homework1.add_task;

public class Address {
    public String index;
    public String country;
    public String city;
    public String street;
    public int house;
    public int apartment;

    public Address (String index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public static void main(String[] args) {
        Address home = new Address("09999", "Ukraine", "Kyiv", "Khreschatik",1,5);
        System.out.println(home);
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
    public String toString() {
        return "Car{" +
                "index=" + index +
                ", country=" + country +
                ", city=" + city +
                ", street=" + street +
                ", house=" + house +
                ", apartment=" + apartment +
                '}';
    }
}
