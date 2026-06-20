public class CountingSort {
    public static void countingSort(int[] n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            max=Math.max(max,n[i]);
        }
        //frequency
        int[] count=new int[max+1];
        for(int i=0;i<n.length;i++){
            count[n[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                n[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] n={1,4,1,3,2,4,3,7};
        countingSort(n);
        print(n);
    }
}
