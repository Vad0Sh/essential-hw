package homework9.task3;

import java.util.Hashtable;

public class MyDictionary {

    public static void main(String[] args) {

        Hashtable<String, String> myDictionary = new Hashtable<>();

        myDictionary.put("01", "Apple");
        myDictionary.put("08", "Banana");
        myDictionary.put("10", "Lemon");

        System.out.println("\nValue at key = 10 : " + myDictionary.get("10"));
        System.out.println("Value at key = 11 : " + myDictionary.get("11"));

        System.out.println("\nIs my dictionary empty? : " + myDictionary.isEmpty() + "\n");

        myDictionary.remove("10");
        System.out.println("Checking if the removed value exists: " + myDictionary.get("10"));
        System.out.println("\nSize of myDictionary : " + myDictionary.size());
    }
}

