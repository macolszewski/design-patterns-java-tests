package designpatterns.command;

public class SubstractCommand implements Command {
    public Calculation calculation;

    public SubstractCommand(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public Double execute() {
        Double result = calculation.getA()-calculation.getB();
        calculation.getResulsts().push(result);
        return result;
    }

}
