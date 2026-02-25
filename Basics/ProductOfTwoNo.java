import java.util.Scanner;

public class ProductOfTwoNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        
        int pro = a * b;
        System.out.println("The product of " + a + " and " + b + " is: " + pro);

    }
}
