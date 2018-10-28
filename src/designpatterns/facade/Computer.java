package designpatterns.facade;

import sun.plugin2.gluegen.runtime.CPU;

public class Computer {
    private Cpu cpu;
    private Gpu gpu;
    private Input input;
    private Ram ram;
    private HardDrive hdd;
    private OperatingSystem os;
    private String name;


    public Computer(String name) {
        this.name = name;
    }

    public void setup(Cpu cpu, Gpu gpu, Input input, Ram ram, HardDrive hdd, OperatingSystem os) {
        this.name = name;
        this.cpu =cpu;
        this.gpu = gpu;
        this.input = input;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }

    public void start() {
        System.out.println(name+" is booting....");
        cpu.start();
        ram.start();
        gpu.start();
        input.start();
        hdd.start();
        os.start();
        System.out.println("Boot complete!");

    }
}
