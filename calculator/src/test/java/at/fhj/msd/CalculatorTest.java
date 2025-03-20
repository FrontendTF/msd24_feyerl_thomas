package at.fhj.msd;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

Calculator calc;

    @BeforeEach
 void setup() {
 calc = new Calculator();
 }

 @DisplayName("Ergebnis")
 @Test
 void testAdd(){
 assertEquals(0, calc.add(0,0));
 }
 @Test
 void testMinus(){
 assertEquals(1, calc.minus(4.0,3.0));
 }
 @Test
 void testDivide(){
 assertEquals(2, calc.divide(4.0,2.0));
 }
 @Test
 void testMultiply(){
 assertEquals(40, calc.multiply(10.0,4.0));
 }


}
