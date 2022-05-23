package homework7.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String test;
    static  Price[] prices = new Price[2];

    public static void main(String[] args) {
        Price price;
        System.out.println(Arrays.toString(prices));
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < prices.length; i++) {
            price = new Price();
            System.out.println("Введите название товара: ");
            price.setName(sc.nextLine());
            System.out.println("Введите магазин где он продается: ");
            price.setShop(sc.nextLine());
            System.out.println("Введите цену товара в гривнах: ");
            price.setPrice(sc.nextInt());
        }
        Arrays.sort(prices, new Price.ComparatorByShop());
            for (Price temp : prices) {
                System.out.println(temp);
            }
        System.out.println("Введите название магазина для проверки: ");
            try { test = sc.nextLine();
                if (test.equals(Price.getShop()));
                System.out.println(Price.getName());
            } catch (RuntimeException exception){
             }
    }
}
