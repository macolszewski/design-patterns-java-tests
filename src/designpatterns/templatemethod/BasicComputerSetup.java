package designpatterns.templatemethod;

public class BasicComputerSetup extends ComputerSetup {
    @Override
    public void addMotherboard() {
        System.out.println("Made in China, unknown provider");
    }

    @Override
    public void addRam() {
        System.out.println("2GB");

    }

    @Override
    public void addGPU() {
        System.out.println("3dfx 16MB");

    }

    @Override
    public void addSoftware() {
        System.out.println("Windows 98 SE + LibreOffice 5.0");

    }

    @Override
    public void addCPU() {
        System.out.println("Intem Atom 1,2 Ghz");

    }
}
