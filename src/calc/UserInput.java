package calc;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);

    double userInputDouble() {
        return scan.nextDouble();
    }

    String userInputSymbol() {
        return scan.next();
    }
}
