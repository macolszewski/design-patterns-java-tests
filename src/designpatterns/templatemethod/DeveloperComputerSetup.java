package designpatterns.templatemethod;

public class DeveloperComputerSetup extends ComputerSetup {
    @Override
    public void addMotherboard() {
        System.out.println("Asrock 2018");
    }

    @Override
    public void addRam() {
        System.out.println("32GB");

    }

    @Override
    public void addGPU() {
        System.out.println("Nvidia GTX 1080 SLI");

    }

    @Override
    public void addSoftware() {
        System.out.println("Linux + sublime text 3");

    }

    @Override
    public void addCPU() {
        System.out.println("Intel Xeon");

    }
}
