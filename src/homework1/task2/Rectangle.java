package homework1.task2;

import java.util.Scanner;

public class Rectangle {


    public static void main(String[] args) {
        System.out.println("Введите сторону прямоугольника:");

        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        areaCalculator ( side1,  side2);
        perimeterCalculator ( side1, side2);


    }
    public static double areaCalculator (double side1, double side2) {
        double result;
        result = side1 * side2;
        System.out.println("Площадь прямоугольника равна: " +result);
        return  result;
    }
    public static double perimeterCalculator (double side1, double side2) {
        double result;
        result = 2 * (side1 + side2);
        System.out.println("Периметр прямоугольника равен: " +result);
        return  result;
    }
}
