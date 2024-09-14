public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int a = 10;
        int b = 4;

        System.out.println(Calculator.add(a, b));
        System.out.println(Calculator.substract(a, b));
        System.out.println(Calculator.multiply(a, b));
        System.out.println(Calculator.divide(a, b));
    }
}
