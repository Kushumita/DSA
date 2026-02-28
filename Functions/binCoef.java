public class binCoef {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int binomialCoefficient(int n, int r) {
        if (r > n || r < 0) {
            return 0;
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int result = binomialCoefficient(n, r);
        System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + result);
    }
}
