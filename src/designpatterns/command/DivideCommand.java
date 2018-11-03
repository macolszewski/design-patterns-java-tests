package designpatterns.command;

public class DivideCommand implements Command {
    public Calculation calculation;

    public DivideCommand(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public Double execute() {
        Double result;
        if (calculation.getB() != 0) {

            result = calculation.getA() / calculation.getB();
        } else {
            result = 0.0;
        }
        calculation.getResulsts().push(result);
        return result;
    }
}
