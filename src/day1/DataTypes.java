package day1;
public class DataTypes {
    public int sum(int a, int b) {
        return a + b;
    }
    public void swapValuesAndPrint(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    public void calculateCircleAreaAndCircumference(int r) {
        if (r < 0) {
            System.out.println("Radius cannot be negative!");
            return;
        }
        double pi = Math.PI;
        double area = pi * Math.pow(r, 2);
        double circumference = 2 * pi * r;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
    public boolean isEven(int a) {
        return a % 2 == 0;
    }
    public double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
    public double calculateCompoundInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0) {
            throw new IllegalArgumentException("Principal and rate must be non-negative!");
        }
        return principal * Math.pow(1 + rate, years);
    }
    public void checkNumberSign(int a) {
        if (a < 0) {
            System.out.println("Negative");
        } else if (a == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }
    }
    public void swapValuesWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
