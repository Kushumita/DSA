public class LargestSmallestNum {
    public static int largestsmallest(int num[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("Smallest number: "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int num[]={2,4,3,6,12,7};
        System.out.println("Largest number: "+largestsmallest(num));
    }
}