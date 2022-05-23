package homework7.task3;

import homework7.task2.Worker;

import java.util.Comparator;

public class Price {
    private static String name;
    private static String shop;
    private static int price;

    public static String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
        }
    public static String getShop() {
        return shop;
    }
    public void setShop(String price) {
        this.shop =shop;
    }
    public static int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", shop='" + shop + '\'' +
                ", price=" + price +
                '}';
    }
    static class ComparatorByShop implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Price) o1).shop.compareTo(((Price)o2).shop) ;

        }
    }
}
