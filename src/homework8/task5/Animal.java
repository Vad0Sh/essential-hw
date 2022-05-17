package homework8.task5;

public class Animal {
    String name;
    int age;
    Boolean tail;

    public static void main(String[] args) {
        Animal animal = new Animal("Васька ", 45, false);
        System.out.println(animal.toString());
        }

    public Animal(String name, int age, Boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }


    @Override
    public String toString() {
        return "Имя: " + name +
                ", возраст: " + age +
                ", хвост: нет" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (!name.equals(animal.name)) return false;
        return tail.equals(animal.tail);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + tail.hashCode();
        return result;
    }
}
