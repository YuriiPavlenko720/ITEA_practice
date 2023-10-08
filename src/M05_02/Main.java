package M05_02;

public class Main {
    public static void main(String[] args) {
        Playable player01 = new Player("SONY");
        Recordable player02 = new Player("Toshiba");

        player01.play();
        player02.record();
        player01.pause();
        player01.play();
        player02.pause();
        player02.record();
        player01.stop();
        player02.stop();

    }
}
