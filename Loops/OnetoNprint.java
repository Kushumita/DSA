import java.util.*;
public class OnetoNprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i=1;
        int n = sc.nextInt(); 
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}
