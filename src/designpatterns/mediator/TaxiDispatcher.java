package designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class TaxiDispatcher implements Dispatcher {
    private List<Driver> drivers;

    public TaxiDispatcher() {
        this.drivers = new ArrayList<>();
    }

    @Override
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    @Override
    public void takeOrder(String order) {
        if (sendOrder(order)) {
            System.out.println("take order: " + order + " ---> accept");
        } else {
            System.out.println("take order: " + order + " ---> refused");
        }

    }

    @Override
    public boolean sendOrder(String order) {
        for (Driver driver : drivers) {
            if (driver.driverStatus == DriverStatus.WAITING_FOR_ORDER) {
                driver.startOrder(order);
                driver.setDriverStatus(DriverStatus.DURING_ORDER);
                return true;
            }
        }
        return false;

    }

    @Override
    public void updateDriverStatus(Driver driver) {
        System.out.println("Update driver status: " + driver.toString());

    }
}
