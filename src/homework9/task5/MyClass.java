package homework9.task5;

public class MyClass {
     <T> T factoryMethod() {
        return (T) new MyClass();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.factoryMethod();
    }
}
