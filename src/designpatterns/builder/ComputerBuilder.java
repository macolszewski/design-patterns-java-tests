package designpatterns.builder;

public abstract class ComputerBuilder {
    protected String computerName;
    protected String computerRam;
    protected String computerMonitor;
    protected String computerAc;
    protected String computerCpu;
    protected String computerGpu;
    protected String computerKeyboard;

    public ComputerBuilder setComputerMonitor(String computerMonitor) {
        this.computerMonitor = computerMonitor;
        return this;
    }

    public ComputerBuilder setComputerAc(String computerAc) {
        this.computerAc = computerAc;
        return this;
    }

    public ComputerBuilder setComputerCpu(String computerCpu) {
        this.computerCpu = computerCpu;
        return this;
    }

    public ComputerBuilder setComputerGpu(String computerGpu) {
        this.computerGpu = computerGpu;
        return this;
    }

    public ComputerBuilder setComputerKeyboard(String computerKeyboard) {
        this.computerKeyboard = computerKeyboard;
        return this;

    }

    public ComputerBuilder setComputerName(String computerName){
        this.computerName = computerName;
        return this;
    }

    public ComputerBuilder setComputerRam(String computerRam){
        this.computerRam = computerRam;
        return this;
    }

     public abstract Computer build();
}
