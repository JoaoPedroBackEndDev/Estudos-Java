package model.entities;

public class Calculator {

    public double Calcular(double number1, double number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case 'x':
                return number1 * number2;
            case '-':
                return number1 - number2;
            case '/':
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    throw new ArithmeticException("Division Error");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
