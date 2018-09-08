package designpatterns.decorator;

public class BasePizza implements Pizza {

    @Override
    public void showComponents() {
        System.out.println("Ciasto");
        System.out.println("Sos");
        System.out.println("Ser");
    }

    @Override
    public void makePizza() {}

    @Override
    public void bakePizza() {}
}
