package homework7.task2;

import java.util.Comparator;

public class Worker {
    private String name;
    private String surname;
    private String position;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", year=" + year +
                '}';
    }

    static class ComparatorByYear implements Comparator {
        public int compare(Object o1, Object o2) {
            return ((Worker) o1).year - ((Worker) o2).year;

        }
    }
}