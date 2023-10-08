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
    public void play() {
        System.out.println(this.name + " is playing.");
    }

    @Override
    public void pause() {
        System.out.println(this.name + " paused.");
    }

    @Override
    public void stop() {
        System.out.println(this.name + " stopped.");
    }

    @Override
    public void record() {
        System.out.println(this.name + " is recording.");
    }
}
