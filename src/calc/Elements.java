package calc;

public class Elements {
    double x;
    double y;
    String symbol;
    UserInput answer = new UserInput();

    public double getX() {
        return x;
    }

    public void setX() {
        this.x = answer.userInputDouble();
    }

    public double getY() {
        return y;
    }

    public void setY() {
        this.y = answer.userInputDouble();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol() {
        this.symbol = answer.userInputSymbol();
    }
}
