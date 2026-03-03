public class SubArray {
    public static void printSubarrays(int num[]){
        int ts=0;
        for(int i=0;i<num.length;i++){//start
            for(int j=i;j<num.length;j++){//end
                for(int k=i;k<=j;k++){//print
                    System.out.print(num[k]+" ");
        }
        System.out.println();
        ts++;
    }
    System.out.println();
}
System.out.println(ts);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printSubarrays(num);
    }
}
