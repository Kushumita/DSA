public class OverloadingDatatypes {
    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        int result1 = sum(5, 10);
        float result2 = sum(5.5f, 10.5f);
        System.out.println("The sum of 5 and 10 is: " + result1);
        System.out.println("The sum of 5.5 and 10.5 is: " + result2);
    }
}
