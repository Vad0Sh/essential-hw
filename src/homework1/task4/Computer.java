package homework1.task4;

import java.util.Arrays;

public class Computer {
    private String name;
    public static int number;


    public Computer( String name ){
        this.name =name;

    }
    public static Computer createComputer(String name) {
        number++;
        return new Computer(name );
    }

   public static void main(String[] args) {
        Computer[] Computers = new Computer[5];


 for (int i = 0; i < Computers.length; i++){
    Computers[i] = Computer.createComputer("intel" +i);
        }
       System.out.println( Arrays.toString(Computers));
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }
}
