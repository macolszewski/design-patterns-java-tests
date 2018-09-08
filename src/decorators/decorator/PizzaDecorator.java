package decorators.decorator;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void showComponents() {
        pizza.showComponents();
    }

    @Override
    public void makePizza() {
        System.out.println("Robię pizze, proszę czekać!");
    }

    @Override
    public void bakePizza() {
        System.out.println("Pizza jest w piecu, proszę czekać...");
    }
}
