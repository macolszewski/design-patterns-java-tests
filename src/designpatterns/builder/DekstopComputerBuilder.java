package designpatterns.builder;

public class DekstopComputerBuilder extends ComputerBuilder{

    @Override
    public Computer build() {
        return new Computer(ComputerType.DESKTOP, computerName, computerMonitor, computerRam, computerKeyboard, computerCpu, computerGpu, computerAc);
    }
}
