public class FastExponentiation {
    public static int fastExponentiation(int n,int pow){
        int ans=1;
        while(pow>0){
            if((pow&1)!=0){
                ans*=n;
            }
            n=n*n;
            pow=pow>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExponentiation(3,5));
    }
}