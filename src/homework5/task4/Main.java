package homework5.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = ((int)(Math.random() * 11) + 10);
            randomList.add(a);
        }
        System.out.println(randomList);
        System.out.println("Минимальный элемент списка: " + Collections.min(randomList));
        System.out.println("Максимальный элемент списка: " + Collections.max(randomList));
        ListIterator<Integer> listIterator = randomList.listIterator();
        while(listIterator.hasNext()) {
            listIterator.set(listIterator.next() + 1);
        }

            System.out.println(randomList);

    }
}
