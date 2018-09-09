package designpatterns.composite;


public class Explorer {

    public static void main(String[] args) {
        DataStructure programFiles = new Directory("Program Files");
        DataStructure file = new File("batman.mp4");
        DataStructure music = new Directory("Music");
        DataStructure track1 = new File("track1.mp3");
        DataStructure track2 = new File("track2.mp3");
        DataStructure rockMusic = new Directory("Rock");
        DataStructure rockTrack = new File("rockTrack.mp3");
        rockMusic.addChild(rockTrack);
        music.addChild(rockMusic);
        music.addChild(track1);
        music.addChild(track2);
        programFiles.addChild(file);
        programFiles.addChild(music);
        programFiles.browse();
    }
}
