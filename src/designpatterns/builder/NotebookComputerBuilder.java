package designpatterns.builder;

public class NotebookComputerBuilder extends ComputerBuilder {

    @Override
    public Computer build() {
        return new Computer(ComputerType.NOTEBOOK, computerName, computerMonitor, computerRam, computerKeyboard, computerCpu, computerGpu, computerAc);
    }
}
