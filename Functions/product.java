public class product {
    public static int product(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = product(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }
}
