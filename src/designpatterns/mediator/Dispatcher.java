package designpatterns.mediator;

public interface Dispatcher {

    void takeOrder(String order);
    boolean sendOrder(String order);
    void updateDriverStatus(Driver driver);
    void addDriver(Driver driver);


}
