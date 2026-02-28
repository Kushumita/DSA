import java.util.*;
public class parameters {
    public static int calculateSum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = calculateSum(num1, num2);
        System.out.println("The sum is: " + sum);
    }
}
