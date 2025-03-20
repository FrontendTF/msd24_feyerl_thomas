# JUnit Test Cases for the Calculator Class

---

## **Test Cases:**

### 1️ `testAdd()`

- **Description:** Tests the `add()` method of the calculator with the values `0 + 0`.
- **Expected Result:** `0`

### 2️ `testMinus()`

- **Description:** Tests the `minus()` method of the calculator with the values `4 - 3`.
- **Expected Result:** `1`

### 3️ `testDivide()`

- **Description:** Tests the `divide()` method of the calculator with the values `4 / 2`.
- **Expected Result:** `2`

### 4️ `testMultiply()`

- **Description:** Tests the `multiply()` method of the calculator with the values `10 * 4`.
- **Expected Result:** `40`

---

## **Exception Handling:**

### **Division by Zero**

In the `Calculator.java` implementation, the `divide()` method prevents division by zero by throwing an `ArithmeticException`:

```java
public double divide(double number1, double number2) {
    if (number2 == 0) {
        throw new ArithmeticException("Division by zero is not allowed!");
    }
    return number1 / number2;
}
```

---

## **Test Coverage**

To check the test coverage, I followed these steps:

1. Right-click on `CalculatorTest.java`
2. Select **More Run/Debug -> Run … with coverage**
3. The test coverage will be displayed.

![Test Coverage](resources/images/ex4_1.png)
