package homework2.task3;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car();
        Car secondCar = new Car(2011);
        Car thirdCar = new Car( 2012, 160);
        Car fourthCar = new Car(2002, 150, 1353);
        Car fifthCar = new Car(2020, 180, 1630, "White");
        System.out.println("year " + firstCar.getYear() + " speed " + firstCar.speed + " weight " + firstCar.weight +" colour " + firstCar.colour);
        System.out.println("year " + secondCar.getYear() + " speed " + secondCar.speed + " weight " + secondCar.weight +" colour " + secondCar.colour);
        System.out.println("year " + thirdCar.getYear() + " speed " + thirdCar.speed + " weight " + thirdCar.weight +" colour " + thirdCar.colour);
        System.out.println("year " + fourthCar.getYear() + " speed " + fourthCar.speed + " weight " + fourthCar.weight +" colour " + fourthCar.colour);
        System.out.println("year " + fifthCar.getYear() + " speed " + fifthCar.speed + " weight " + fifthCar.weight +" colour " + fifthCar.colour);
    }
}
