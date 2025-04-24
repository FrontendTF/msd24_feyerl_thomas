package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Calculator class contains basic mathematics operations like
 * addition, subtraction, multiplication, division und factorial calculation.
 * <p>
 * Additionally, the class uses logging for debugging and bug tracking.
 * </p>
 * @author Thomas Feyerl
 */
public class Calculator {

     /**
     * Logger for debugging and error logging to a log file.
     */
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    
       /**
     * Adds two decimal numbers.
     *
     * @param number1 The first number
     * @param number2 The second number
     * @return The sum of number1 and number2
     */
      public double add(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 + number2;
    }

      /**
     * Subtracts number2 from number1.
     *
     * @param number1 The first number
     * @param number2 The second number
     * @return The result of the subtraction
     */
    public double minus(double number1, double number2) {
        logger.debug("number1: " + number1 + " | " + "number2: " + number2);
        return number1 - number2;
    }

      /**
     * Multiplies two decimal numbers.
     *
     * @param number1 The first number
     * @param number2 The second number
     * @return The product of the two numbers
     */
    public double multiply(double number1, double number2) {

        logger.info("multiply called with: number1="+ number1 + ", number2=" + number2);
        logger.debug("number1: " + number1 + " * " + "number2: " + number2);

        return number1 * number2;
    }

     /**
     * Divides number1 by number2.
     *
     * @param number1 The dividend
     * @param number2 The divisor
     * @return The quotient of the division
     * @throws ArithmeticException If division by zero is attempted
     */
    public double divide(double number1, double number2) {

        if (number2 == 0) {
            logger.error("Divison by 0!");
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return number1 / number2;
    }
     /**
     * Calculates the factorial of a non-negative integer.
     * <p>
     * If {@code n} is less than 0, the method returns 0.
     * </p>
     * 
     * <p><b>Examples:</b></p>
     * <ul>
     *   <li>{@code factorial(0)} returns {@code 1}</li>
     *   <li>{@code factorial(5)} returns {@code 120}</li>
     * </ul>
     *
     * @param n The non-negative number to calculate the factorial for
     * @return The factorial of {@code n}, or 0 if {@code n < 0}
     */
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
