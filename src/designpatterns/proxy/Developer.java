package designpatterns.proxy;

public class Developer implements Employee {

    @Override
    public void generateTimeReport() {
            System.out.println("Generuję raport dla Developera!");
    }

    @Override
    public boolean hasPermisson() {
        return false;
    }

    @Override
    public String toString() {
        return "Developer";
    }
}
