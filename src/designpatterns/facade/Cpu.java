package designpatterns.facade;

public class Cpu implements Component {
    private String name;

    public Cpu(String name) {
        this.name = name;

    }

    @Override
    public void start() {
        System.out.println(name+" initialized!");
    }
}
