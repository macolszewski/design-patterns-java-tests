package designpatterns.mediator;

public class TaxiDriver extends Driver {

    public TaxiDriver(Dispatcher dispatcher) {
        super(dispatcher);
        this.driverStatus = DriverStatus.WAITING_FOR_ORDER;
    }

    public TaxiDriver(Dispatcher dispatcher, DriverStatus driverStatus) {
        super(dispatcher);
        this.driverStatus = driverStatus;
    }


    @Override
    public void startOrder(String order) {
        System.out.println("Zaczynam zamówienie: " + order);

    }

    @Override
    public void stopOrder(String order) {
        driverStatus = DriverStatus.WAITING_FOR_ORDER;
        dispatcher.updateDriverStatus(this);

    }
}
