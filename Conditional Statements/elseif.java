public class elseif {
    public static void main(String[] args) {
        int a = 10;        
        int b = 20;
        if (a > b) {
            System.out.println(a + " is the largest number.");
        }
        else if (b > a) {
            System.out.println(b + " is the largest number.");
        }
        else {
            System.out.println("Both numbers are equal.");
        }
    }    
}
