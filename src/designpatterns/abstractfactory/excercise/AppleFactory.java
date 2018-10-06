package designpatterns.abstractfactory.excercise;

public class AppleFactory implements SmartDeviceFactory {


    @Override
    public SmartWatch createSmartWatch() {
        return new AppleWatch();

    }

    @Override
    public SmartPhone createSmartPhone() {
        return new IPhone();

    }

    @Override
    public String toString() {
        return "AppleFactory:";
    }
}
