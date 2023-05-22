interface Calculator {
    double calculate(double num1, double num2, String operator);
}

class BasicCalculator implements Calculator {
    @Override
    public double calculate(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        double num1 = 10.5;
        double num2 = 5.2;
        String operator = "+";
        double result = calculator.calculate(num1, num2, operator);
        System.out.println("Result: " + result);
    }
}