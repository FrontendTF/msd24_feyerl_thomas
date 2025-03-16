package at.fhj.msd;

public class Calculator {
      // Addition
      public double add(double number1, double number2) {
        return number1 + number2;
    }

    // Subtraktion
    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    // Multiplikation
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    // Division
    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt!");
        }
        return number1 / number2;
    }
}
