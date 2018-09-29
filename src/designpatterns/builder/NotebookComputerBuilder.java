package designpatterns.builder;

public class NotebookComputerBuilder extends ComputerBuilder {

    @Override
    public Computer build() {
        return new Computer(ComputerType.NOTEBOOK, HarddriveType.SSD, computerName, "Wbudowany", computerRam, "Wbudowana", computerCpu, computerGpu, "Zewnętrzny", "Obudowa laptop");
    }
}
