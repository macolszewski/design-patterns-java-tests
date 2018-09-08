package decorators.decorator;

public class SpamPizza extends PizzaDecorator {

    public SpamPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void showComponents() {
        super.showComponents();
        System.out.println("Mielonka");
    }

}
