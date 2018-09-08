package designpatterns.factorymethod;

public class CarObjectsFactory implements CarFactry {

    @Override
    public Car produceCar(CarType type) {
        Car car = null;

        switch (type) {
            case SEDAN:
                car = new Sedan();
                break;
            case KOMBI:
                car = new Kombi();
                break;
        }
        return car;
    }
}

