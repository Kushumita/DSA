public class Insertion {
    public static void insertionSort(int n[]){
        for(int i=1;i<n.length;i++){
            int curr=n[i];
            int prev=i-1;
            //finding out the correct postion to insert
            while(prev>=0 && n[prev]>curr){
                n[prev+1]=n[prev];
                prev--;
            }
            //insertion
            n[prev+1]=curr;
        }
    }
    public static void print(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] n={5,4,1,3,2};
        insertionSort(n);
        print(n);
    }
}
