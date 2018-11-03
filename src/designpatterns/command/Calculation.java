package designpatterns.command;

import java.util.Stack;

public class Calculation {
    private Double a;
    private Double b;
    private Stack<Double> resulsts = new Stack<>();

    public Calculation(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Stack<Double> getResulsts() {
        return resulsts;
    }

    public void setResulsts(Stack<Double> resulsts) {
        this.resulsts = resulsts;
    }

    public Double getLastResult() {
        return resulsts.lastElement();
    }

    public Double reverseResult(int reverse_count) {
        if (reverse_count<getResulsts().size()) {
            for (int i = 0; i < reverse_count; i++) {
                getResulsts().pop();
            }
            return getLastResult();
        } else {
            return 0.0;
        }
    }
}
