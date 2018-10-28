package designpatterns.facade;

public class Gpu implements Component {
    private String name;

    public Gpu(String name) {
        this.name = name;

    }

    @Override
    public void start() {
        System.out.println(name+" initialized!");
    }
}
