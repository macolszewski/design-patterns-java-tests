package designpatterns.bridge;

public interface PlayerAPI {

    public void play();
    public void pause();
    public void next();
    public void previous();
    public void addFile(File file);

}
