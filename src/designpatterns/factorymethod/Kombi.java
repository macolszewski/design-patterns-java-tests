package designpatterns.factorymethod;

public class Kombi extends Car {
    public Kombi() {
        super(CarType.KOMBI);
    }

    @Override
    public String toString() {
        return "Kombi{" +
                "carType=" + carType +
                "} " + super.toString();
    }
}
