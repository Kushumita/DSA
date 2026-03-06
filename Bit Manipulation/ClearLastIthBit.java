public class ClearLastIthBit {
    public static int clearLastithBit(int n,int i){
        int bitMask=(~0)<<i;       
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastithBit(15,2));
    }
}
