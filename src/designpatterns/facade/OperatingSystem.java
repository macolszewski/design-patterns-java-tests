package designpatterns.facade;

public class OperatingSystem implements Component {
    private String name;

    public OperatingSystem(String name) {
        this.name = name;

    }

    @Override
    public void start() {
        System.out.println(name+" initialized!");
    }
}
