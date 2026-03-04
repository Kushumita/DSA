public class BubbleSort {
    public static void bubbleSort(int[] n){
        //outer loop-turns
        for(int i=0;i<n.length-1;i++){
            //inner loop-comparisons
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                    //swap
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
    }
    public static void print(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] n={5,1,3,2,4};
        bubbleSort(n);
        print(n);
    }
}