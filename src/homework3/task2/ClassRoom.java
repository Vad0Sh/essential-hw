package homework3.task2;

public class ClassRoom {
    public Pupil[] classRoom;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.classRoom = new Pupil[]{pupil1, pupil2, pupil3, pupil4};
    }
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(
                new ExcellentPupil(),
                new GoodPupil(),
                new BadPupil(),
                new BadPupil()
        );

        classRoom.showClassRoom();

    }public void showClassRoom() {
        for (Pupil pupil: classRoom) {
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println();
        }
    }

}
class Pupil {
    void study(){
        System.out.println("I can study");
    }

    void read() {
        System.out.println("I can read");
    }

    void write() {
        System.out.println("I can write");
    }

    void relax() {
        System.out.println("I can relax");
    }

}
class ExcellentPupil extends Pupil {
    void study(){
        System.out.println("I can study excellent");
    }

    void read() {
        System.out.println("I can read excellent");
    }

    void write() {
        System.out.println("I can write excellent");
    }

    void relax() {
        System.out.println("I can relax bad");
    }

    }

class GoodPupil extends Pupil {
    void study(){
        System.out.println("I can study good");
    }

    void read() {
        System.out.println("I can read good");
    }

    void write() {
        System.out.println("I can write good");
    }

    void relax() {
        System.out.println("I can relax not so good");
    }


}
class BadPupil extends Pupil {
    void study(){
        System.out.println("I can study bad");
    }

    void read() {
        System.out.println("I can't read");
    }

    void write() {
        System.out.println("I can write bad");
    }

    void relax() {
        System.out.println("I can relax perfect!");
    }


}