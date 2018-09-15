package designpatterns.bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class MediaPlayer implements PlayerAPI {
    private List<File> files = new ArrayList<>();


    @Override
    public void play() {
        for (File file : this.files) {
            System.out.println("Odtwarzam " + file.getName());
        }
    }

    @Override
    public void pause() {
        System.out.println("Odtwarzanie zatrzymane!");

    }

    @Override
    public void next() {
        System.out.println("Oddtawrzanie następnego pliku..");
    }

    @Override
    public void previous() {
        System.out.println("Oddtawrzanie poprzedniego pliku..");
    }

    @Override
    public void addFile(File file) {
        this.files.add(file);
    }
}