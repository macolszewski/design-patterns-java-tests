package designpatterns.abstractfactory.excercise;

public class IPhone implements SmartPhone {
    @Override
    public void show() {
        System.out.println("\t- iPhone");
    }
}
