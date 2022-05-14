package homework6.task4;

enum Vehicles {
    FORD("Ford","red",10000),
    TOYOTA("Toyota", "black", 12000),
    VOLKSWAGEN("Volkswagen", "White", 15000);
    int price;
    String name;
    String colour;


    Vehicles(String name, String colour, int price) {
        this.name = name;
        this.colour = colour;
        this.price = price;

    }
    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Vehicle " +
                "name= " + name +
                ", colour= " + colour +
                ", price= " + price  + " USD";
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicles vehicle = Vehicles.VOLKSWAGEN;
        System.out.println(vehicle.toString());
        System.out.println(vehicle.getColour());
    }
}
