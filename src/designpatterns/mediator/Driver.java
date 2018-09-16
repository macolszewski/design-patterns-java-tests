package designpatterns.mediator;

public abstract class Driver {
    protected DriverStatus driverStatus;
    protected Dispatcher dispatcher;

    public Driver(Dispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    public abstract void startOrder(String order);

    public abstract void stopOrder(String order);

    public DriverStatus getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }
}
