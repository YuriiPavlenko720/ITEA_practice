package M05_02;

public class Player implements Playable, Recordable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    @Override

    public void play(int track) {
        System.out.println(this.name + " starting playing track #" + track + ".");
    }

    @Override
    public void pause(int track) {
        System.out.println(this.name + " paused playing track #" + track + ".");
    }

    @Override
    public void stop(int track) {
        System.out.println(this.name + " stopped playing track #" + track + ".");
    }

    @Override
    public void record() {
        System.out.println(this.name + " started recording.");
    }

    @Override
    public void pause() {
        System.out.println(this.name + " paused recording.");
    }

    @Override
    public void stop() {
        System.out.println(this.name + " stopped recording.");
    }
}
