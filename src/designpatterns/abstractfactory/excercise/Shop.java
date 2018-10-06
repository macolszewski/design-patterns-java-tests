package designpatterns.abstractfactory.excercise;

public class Shop {
    private final SmartDeviceFactory smartDeviceFactory;
    private final SmartPhone smartPhone;
    private final SmartWatch smartWatch;

    public Shop(SmartDeviceFactory smartDeviceFactory) {
        this.smartDeviceFactory = smartDeviceFactory;
        this.smartPhone = smartDeviceFactory.createSmartPhone();
        this.smartWatch = smartDeviceFactory.createSmartWatch();
    }

    public void showProducts() {
        System.out.println(smartDeviceFactory.toString());
        smartWatch.show();
        smartPhone.show();
        System.out.println();
    }

}
