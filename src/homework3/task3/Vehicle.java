package homework3.task3;

import java.util.Scanner;

public class Vehicle {
    public int speed;
    public int year;
    public int weight;

public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите транспортное средство ");
    switch (scan.next()) {
        case "Car", "car" -> {
            Car vehicle1 = new Car();
            System.out.println("Parameters of this Car:");
            System.out.println("Speed " + vehicle1.speed);
            System.out.println("Year " + vehicle1.year);
            System.out.println("Weight " + vehicle1.weight);
        }
        case "Ship", "ship" -> {
            Ship vehicle2 = new Ship();
            System.out.println("Parameters of this Ship:");
            System.out.println("Port " + vehicle2.port);
            System.out.println("Number of passengers " + vehicle2.numOfPassengers);
        }
        case "Plane", "plane" -> {
            Plane vehicle3 = new Plane();
            System.out.println("Parameters of this Plane:");
            System.out.println("Port " + vehicle3.height);
            System.out.println("Number of passengers " + vehicle3.numOfPassengers);
        }
        default -> System.out.println("Я не понимаю что Вы от меня хотите! Извините!");
    }

        }
    }
    class Car extends Vehicle {
    int speed=200;
    int year= 2020;
    int weight = 1500;


    }
    class Ship extends Vehicle {
    int numOfPassengers = 250;
    String port = "Odessa";
    }

    class Plane extends Vehicle {
    int height = 12000;
    int numOfPassengers = 120;
}

