public class Calculator {
    private int num1;
    private int num2;

    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculator(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int add() {
        return num1 + num2;
    }

    public int substract() {
        return num1 - num2;
    }

    public int multiply() {
        return  num1 * num2;
    }

    public float divide() {
        return (float) (num1 * 1.0) / num2;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static float divide(int a, int b) {
        return (float) (a * 1.0) / b;
    }

    public static int multiply(int a, int b) {
        return a / b;
    }
}
