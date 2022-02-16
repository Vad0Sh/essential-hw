package homework5.task2_3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
       zoo.add(0,"Слон");
       zoo.add(1,"Жираф");
       zoo.add(2,"Бегемот");
       zoo.add(3,"Крокодил");
       zoo.add(4,"Орел");
       zoo.add(5,"Лиса");
       zoo.add(6,"Заяц");
       zoo.add(7,"Волк");

        System.out.println("task2");
        System.out.println();
        System.out.println(zoo);
        System.out.println("=====================================================================");

        System.out.println("task3");
        System.out.println("Изначальный размер списка " +zoo.size());
        zoo.remove(6);
        zoo.remove(4);
        zoo.remove(2);
        System.out.println("Новый размер списка "+zoo.size());
        System.out.println();
        System.out.println("Новый список");
        System.out.println(zoo);

    }
}
