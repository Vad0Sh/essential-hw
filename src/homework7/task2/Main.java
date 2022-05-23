package homework7.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Worker[] workers = new Worker[5];
    public static void main(String[] args) {
        Worker worker;
        System.out.println(Arrays.toString(workers));
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < workers.length; i++) {
            worker = new Worker();
            System.out.println("Введите имя работника: ");
            worker.setName(scanner.nextLine());
            System.out.println("Введите фамилию работника: ");
            worker.setSurname(scanner.nextLine());
            System.out.println("Введите должность работника: ");
            worker.setPosition(scanner.nextLine());
            System.out.println("Введите год поступления на работу: ");
            try {
                worker.setYear(Integer.parseInt(scanner.nextLine()));
                boolean years = worker.getYear() < 2010;
                if (years) {
                    System.out.println("Работник работает очень много, давайте повысим ему зарплату!");
                }
            } catch (NumberFormatException exception) {
                System.out.println(" Вы ввели неверное число. Повторите попытку.");
                worker.setYear(Integer.parseInt(scanner.nextLine()));
            }
            workers[i] = worker;
            System.out.println(Arrays.toString(workers));
        }
        Arrays.sort(workers, new Worker.ComparatorByYear());
        for (Worker temp : workers) {
            System.out.println(temp);
        }
    }
}
