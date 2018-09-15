package designpatterns.bridge;

public class ExoPlayer extends MediaPlayer {

    @Override
    public void play() {
        System.out.println("ExoPlayer:");
        super.play();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void next() {
        super.next();
    }

    @Override
    public void previous() {
        super.previous();
    }
}
