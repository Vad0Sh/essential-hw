package homework2.task3;

public class Car {
    int year;
    double speed;
    int weight;
    String colour;

    public Car() {}

    public  Car(int year) {
        this.year = year;
    }
    public Car( int year, double speed ) {
        this.year = year;
        this.speed = speed;
    }
    public Car ( int year, double speed, int weight ) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }
    public Car( int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }
}
