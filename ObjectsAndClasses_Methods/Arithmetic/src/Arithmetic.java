public class Arithmetic {
    private static int a = 3;
    private static int b = 5;

    public static int calculateSum () {
        int sum = a + b;
        return sum;
    }

    public static int calculateMultiplication () {
        int multiplication = a * b;
        return multiplication;
    }

    public static int calculateMax () {
        int max = Math.max(a, b);
        return max;
    }

    public static int calculateMin () {
        int min = Math.min(a, b);
        return min;
    }
}
