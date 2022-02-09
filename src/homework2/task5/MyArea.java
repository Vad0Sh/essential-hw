package homework2.task5;

 public class MyArea {
     public static final float PI = 3.14F;
     private double radius;

     public MyArea(double radius) {
         this.radius = radius;
     }

     public double getArea() {
         return radius * radius * PI;
     }

     public double getRadius() {
         return radius;
     }

     @Override
     public String toString() {
         return "Круг {радиус = " + radius + '}';
     }
 }
