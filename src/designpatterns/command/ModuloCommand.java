package designpatterns.command;

public class ModuloCommand implements Command {
    public Calculation calculation;

    public ModuloCommand(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public Double execute() {
        Double result = calculation.getA()%calculation.getB();
        calculation.getResulsts().push(result);
        return result;
    }

}