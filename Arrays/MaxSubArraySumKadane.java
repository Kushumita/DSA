public class MaxSubArraySumKadane {
    public static void maxSubarraySum(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currSum+=num[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("Maximum Subarray Sum: "+maxSum);
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySum(num);
    }
    
}
