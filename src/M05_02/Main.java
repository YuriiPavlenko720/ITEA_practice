package M05_02;

//HW - 05 - 02
//Створіть проєкт з класом Main.java.
//Потрібно: Створіть 2 інтерфейси Playable та Recordable. У кожному з інтерфейсів створіть по 3 методи
// void play() / void pause() / void stop() та void record() / void pause() / void stop() відповідно.
// Створити похідний клас Player від базових інтерфейсів Playable та Recordable.
// Написати програму, яка виконує програвання та запис.

public class Main {
    public static void main(String[] args) {
        Player player01 = new Player("SONY");
        Player player02 = new Player("Toshiba");

        player01.play(3);
        player02.record();
        player01.pause(3);
        player01.play(3);
        player02.pause();
        player02.record();
        player01.stop(3);
        player02.stop();
        player02.play(22);
        player02.stop(22);

    }
}
