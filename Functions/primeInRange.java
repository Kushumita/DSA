public class primeInRange {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 20; 
        System.out.println("Prime numbers in the range from 1 to " + n + ":");
        PrimeinRange(n);
    }
}
