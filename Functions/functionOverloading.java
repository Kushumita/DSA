public class functionOverloading {
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        int result1 = sum(5, 10);
        int result2 = sum(5, 10, 15);
        System.out.println("The sum of 5 and 10 is: " + result1);
        System.out.println("The sum of 5, 10 and 15 is: " + result2);
    }
}
