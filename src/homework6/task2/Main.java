package homework6.task2;

enum Animals {
    LION(15,"Лев"),
    ZEBRA(4, "Зебра"),
    MONKEY(22, "Обезьяна"),
    ELEPHANT(17,"Слон"),
    SNAKE(4,"Змея"),
    WOLF(5,"Волк"),
    SQUIRREL(2, "Белка");
    int age;
    String name;

    Animals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Животное " +
                 name +
                " имеет возраст " + age + " лет";
    }
}

public class Main {
    public static void main(String[] args) {
      Animals animal = Animals.ELEPHANT;
        System.out.println(animal.toString());
    }
}
