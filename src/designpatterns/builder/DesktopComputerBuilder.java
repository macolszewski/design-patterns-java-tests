package designpatterns.builder;

public class DesktopComputerBuilder extends ComputerBuilder{

    @Override
    public Computer build() {
        return new Computer(ComputerType.DESKTOP, HarddriveType.HDD, computerName, computerMonitor, computerRam, computerKeyboard, computerCpu, computerGpu, "Wewnętrzny", computerCover);
    }
}
