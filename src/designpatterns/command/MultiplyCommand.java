package designpatterns.command;

public class MultiplyCommand implements Command {
    public Calculation calculation;

    public MultiplyCommand(Calculation calculation) {
        this.calculation = calculation;
    }


    @Override
    public Double execute() {
        Double result = calculation.getA()*calculation.getB();
        calculation.getResulsts().push(result);
        return result;
    }
}
