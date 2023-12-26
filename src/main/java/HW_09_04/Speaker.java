package HW_09_04;

public class Speaker {

    private String color;
    private boolean on = false;
    private byte volume = 0;

    public Speaker() {
    }

    public Speaker(String color) {
        this.color = color;
    }

    public void onOffButton() {
        this.on = !this.on;
    }

    public void increaseVolume() {
        if (this.volume < 100) {
            this.volume += 1;
        }
    }

    public void decreaseVolume() {
        if (this.volume > 0) {
            this.volume += 1;
        }
    }

    public void speak(String message){
        System.out.println("Attention! There is an important information: " + message.toUpperCase());
    }
}
