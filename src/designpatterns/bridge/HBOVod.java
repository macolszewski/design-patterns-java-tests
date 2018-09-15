package designpatterns.bridge;

public class HBOVod <T extends PlayerAPI> implements Vod {
    private PlayerAPI playerAPI;

    public HBOVod(T t) {
        this.playerAPI = t;
    };

    @Override
    public void startPlaying() {
        playerAPI.play();

    }

    @Override
    public void stopPlaying() {
        playerAPI.pause();

    }

    @Override
    public void addFile(File file) {
        playerAPI.addFile(file);
    }
}
