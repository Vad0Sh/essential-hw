package homework2.task4;

public class Car {
    private static final int DEFAULT_YEAR = 2022;
    private static final double DEFAULT_SPEED = 160;
    private static final int DEFAULT_WEIGHT = 1500;
    private static final String DEFAULT_COLOUR = "White";
    public int year;
    public double speed;
    public int weight;
    public String colour;

    public Car() {}

    public  Car(int year) {
        this(year, DEFAULT_SPEED, DEFAULT_WEIGHT, DEFAULT_COLOUR);
    }
    public Car( int year, double speed ) {
        this(year, speed, DEFAULT_WEIGHT, DEFAULT_COLOUR);
    }
    public Car ( int year, double speed, int weight ) {
        this( year, speed, weight, DEFAULT_COLOUR);
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