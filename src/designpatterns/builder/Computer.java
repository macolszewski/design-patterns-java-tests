package designpatterns.builder;

public class Computer {
    private ComputerType computerType;
    private String name;
    private String monitor;
    private String ram;
    private String klawiatura;
    private String cpu;
    private String gpu;
    private String ac;

    public Computer(ComputerType computerType, String name, String monitor, String ram, String klawiatura, String cpu, String gpu, String ac) {
        this.computerType = computerType;
        this.name = name;
        this.monitor = monitor;
        this.ram = ram;
        this.klawiatura = klawiatura;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ac = ac;
    }

    public ComputerType getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getKlawiatura() {
        return klawiatura;
    }

    public void setKlawiatura(String klawiatura) {
        this.klawiatura = klawiatura;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerType=" + computerType +
                ", name='" + name + '\'' +
                ", monitor='" + monitor + '\'' +
                ", ram='" + ram + '\'' +
                ", klawiatura='" + klawiatura + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ac='" + ac + '\'' +
                '}';
    }
}
