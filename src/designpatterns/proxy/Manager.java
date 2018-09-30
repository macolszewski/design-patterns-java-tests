package designpatterns.proxy;

public class Manager implements Employee {

    @Override
    public void generateTimeReport() {
        System.out.println("Generuję raport dla Managera!");
    }


    @Override
    public boolean hasPermisson() {
        return true;
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
