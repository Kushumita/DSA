import java.util.Arrays;
public class InbuiltSort {
    public static void print(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] n={5,4,1,3,2};
        Arrays.sort(n);
        print(n);
    }
}
