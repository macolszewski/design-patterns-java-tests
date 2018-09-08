package designpatterns.factorymethod;

public class Car {
    protected CarType carType;

    public Car(CarType carType){
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                '}';
    }
}
