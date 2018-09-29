package designpatterns.templatemethod;

public abstract class ComputerSetup {

    public final void setup() {
        System.out.print("Dodaje płytę główną: ");
        addMotherboard();
        System.out.print("Dodaje ram: ");
        addRam();
        System.out.print("Dodaje GPU: ");
        addGPU();
        System.out.print("Dodaje CPU: ");
        addCPU();
        System.out.print("Dodaje oprogramowanie: ");
        addSoftware();
    }


    public abstract void addMotherboard();
    public abstract void addCPU();
    public abstract void addRam();
    public abstract void addGPU();
    public abstract void addSoftware();
}
