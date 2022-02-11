package homework3.task2;

public class ClassRoom {
    public static void main(String[] args) {

    }
}
class Pupil {
    void Study(){
         String study;
    }

    void Read() {
        String read;
    }

    void Vrite() {
        String write;
    }

    void Relax() {
        String relax;
    }

}
class ExelentPupil extends Pupil {
    @Override
    void Read() {
        super.Read ();

    }
}
class GoodPupil extends Pupil {

}
class BadPupil extends Pupil {

}