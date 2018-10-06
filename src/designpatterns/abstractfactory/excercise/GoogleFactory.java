package designpatterns.abstractfactory.excercise;

public class GoogleFactory implements SmartDeviceFactory {
    @Override
    public SmartWatch createSmartWatch() {
        return new WearOSWatch();

    }

    @Override
    public SmartPhone createSmartPhone() {
        return new GooglePixel();

    }

    @Override
    public String toString() {
        return "GoogleFactory:";
    }
}
