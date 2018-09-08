package designpatterns.factorymethod;

public class Sedan extends Car {
    public Sedan() {
        super(CarType.SEDAN);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "carType=" + carType +
                "} " + super.toString();
    }
}
