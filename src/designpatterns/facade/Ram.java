package designpatterns.facade;

public class Ram implements Component {
    private String name;

    public Ram(String name) {
        this.name = name;

    }

    @Override
    public void start() {
        System.out.println(name+" initialized!");
    }
}
