package homework4.task3;

import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}
interface Recordable {
    void record();
    void pause();
    void stop();
}
public class Player implements Playable, Recordable {

    @Override
    public void play() {
        System.out.println("Play track");
    }

    @Override
    public void record() {
        System.out.println("Record track");
    }

    @Override
    public void pause() {
        System.out.println("Pause track");
    }

    @Override
    public void stop() {
        System.out.println("Stop track");
    }

    public static void main(String[] args) {
        Player player = new Player();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите действие для выбраного трека: ");

        switch (scan.next()) {
            case "Play","play","PLAY" -> {
                player.play();
            }
            case "Pause", "PAUSE","pause" -> {
                player.pause();
            }
            case "Stop","STOP", "stop" -> {
                player.stop();
            }
            case "Rec","REC","rec","RECORD","Record","record" -> {
                player.record();
            }
            default -> System.out.println("Действие не распознано, извините!");
        }
    }
}
