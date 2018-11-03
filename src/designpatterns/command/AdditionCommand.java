package designpatterns.command;

public class AdditionCommand implements Command {
    public Calculation calculation;

    public AdditionCommand(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public Double execute() {
        Double result = calculation.getA()+calculation.getB();
        calculation.getResulsts().push(result);
        return result;
    }
}
