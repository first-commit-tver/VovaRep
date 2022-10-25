package calc;

public class Action {
    Elements elements = new Elements();

    void action() {
        System.out.println("Введи число,действие и число");
        elements.setX();
        elements.setSymbol();
        elements.setY();
        if (elements.getSymbol().equalsIgnoreCase("+")) {
            Add add = new Add();
            System.out.println(add.operate(elements.getX(), elements.getY()));
        } else if (elements.getSymbol().equalsIgnoreCase("-")) {
            Sub sub = new Sub();
            System.out.println(sub.operate(elements.getX(), elements.getY()));
        } else if (elements.getSymbol().equalsIgnoreCase("*")) {
            Multiply multiply = new Multiply();
            System.out.println(multiply.operate(elements.getX(), elements.getY()));
        } else if (elements.getSymbol().equalsIgnoreCase("/")) {
            Division division = new Division();
            System.out.println(division.operate(elements.getX(), elements.getY()));
        }

    }
}
