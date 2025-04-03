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
 // Addition
 @Test
 void testAddZeros(){
 assertEquals(0, calc.add(0,0));
 }
 @Test
 void testAddPositve(){
 assertEquals(3, calc.add(2,1));
 }
 @Test
 void testAddNegativ(){
 assertEquals(-4, calc.add(-2,-2));
 }
 // Minus
 @Test
 void testMinusPositives(){
 assertEquals(1, calc.minus(4.0,3.0));
 }
 @Test
 void testMinusNegative(){
 assertEquals(-1, calc.minus(-4.0,-3.0));
 }
 @Test
 void testMinusZeros(){
 assertEquals(0, calc.minus(0,0));
 }
 // Divide
 @Test
 void testDividePositives(){
 assertEquals(2, calc.divide(4.0,2.0));
 }
 @Test
 void testDivideNegatives(){
 assertEquals(-2, calc.divide(-4.0,2.0));
 }
 @Test
 void testDivideZero(){
 assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
 }

// Multiply
 @Test
 void testMultiply(){
 assertEquals(40, calc.multiply(10.0,4.0));
 }
 @Test
 void testMultiplyNegative(){
 assertEquals(-40, calc.multiply(-10.0,4.0));
 }
 @Test
 void testMultiplyZero(){
 assertEquals(0, calc.multiply(0.0,4.0));
 }
 
 // Factorial
 @Test
 void testFactorialPositive() {
 assertEquals(120, calc.factorial(5)); 
 }
 @Test
 void testFactorialZero() {
 assertEquals(1, calc.factorial(0)); 
 }
 
@Test
 void testFactorialNegative() {
 assertEquals(0, calc.factorial(-1)); 
 }
}
