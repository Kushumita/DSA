public class callByValue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        swap(x, y);
    }
}