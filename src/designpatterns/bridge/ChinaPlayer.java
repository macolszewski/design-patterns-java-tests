package designpatterns.bridge;

public class ChinaPlayer extends MediaPlayer {
    @Override
    public void play() {
        System.out.println("Chiński soft daje rade: ");
        super.play();
    }

    @Override
    public void pause() {
        System.out.println("Chiński player mówi Sajonara!");
    }
}
