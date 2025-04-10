package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    
      // Addition
      public double add(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 + number2;
    }

    // Subtraktion
    public double minus(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 - number2;
    }

    // Multiplikation
    public double multiply(double number1, double number2) {

        logger.info("multiply called with: number1="+ number1 + ", number2=" + number2);
        logger.debug("number1: " + number1 + " * " + "number2: " + number2);

        return number1 * number2;
    }

    // Division
    public double divide(double number1, double number2) {

        if (number2 == 0) {
            logger.error("Divison by 0!");
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return number1 / number2;
    }
    // Fakulität
    public int factorial(int n) {
         if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return n * factorial(n - 1);
       
    }
}
