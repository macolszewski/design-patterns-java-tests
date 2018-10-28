package designpatterns.facade;

public class Input implements Component {
    private String name;

    public Input(String name) {
        this.name = name;

    }

    @Override
    public void start() {
        System.out.println(name+" initialized!");
    }
}
