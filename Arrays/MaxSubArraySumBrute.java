public class MaxSubArraySumBrute {
    public static void maxSubarraySum(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){//start
            for(int j=i;j<num.length;j++){//end
                currSum=0;//reset currSum for each new subarray
                for(int k=i;k<=j;k++){//print
                    currSum+=num[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
    System.out.println("Maximum Subarray Sum: "+maxSum);
}
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        maxSubarraySum(num);
    }
}  

