package calc;

public class Sub implements Operation {
    @Override
    public double operate(double x, double y) {
        return x - y;
    }
}
