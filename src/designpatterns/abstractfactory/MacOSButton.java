package designpatterns.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS button: -> Apple!");
    }
}
