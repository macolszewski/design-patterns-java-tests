package designpatterns.facade;

public class HardDrive implements Component {
    private String name;

    public HardDrive(String name) {
        this.name = name;

    }

    @Override
    public void start() {
        System.out.println(name+" initialized!");
    }
}
