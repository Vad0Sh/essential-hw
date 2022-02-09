package homework2.task5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            scan.useLocale(Locale.US);
            System.out.print("Input radius: ");
            double radius = scan.nextDouble();

            MyArea circle = new MyArea(radius);
            System.out.println(circle);
            System.out.println("Площадь круга: " + circle.getArea());
        }
    }
