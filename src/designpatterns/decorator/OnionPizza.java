package designpatterns.decorator;

public class OnionPizza extends PizzaDecorator {

    public OnionPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void showComponents() {
        super.showComponents();
        System.out.println("Cebula");
    }

}
