
package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 10;
        double num2 = 5;
    //    int num3 = 100;
      //  int num4 = 5;

        // Methodenaufrufe
        System.out.println("Thomas Feyerl");
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraktion: " + calculator.minus(num1, num2));
        System.out.println("Multiplikation: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    //    System.out.println("Fakulität" + calculator.factorial(num3,num4));


        // Testfall für Division durch Null
        try {
            System.out.println("Division durch 0: " + calculator.divide(num1, 0));
        } catch (ArithmeticException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
