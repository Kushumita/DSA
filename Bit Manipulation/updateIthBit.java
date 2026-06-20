public class updateIthBit {
        public static int clearIthBit(int n,int i){
            return n&(~(1<<i));
        }
        public static int setIthBit(int n,int i){
            return n | (1<<i);
        }
        public static int updateIthBit(int n,int i,int u){
    //        if(u==0){
    //           return clearIthBit(n,i);
    //        }
    //        else{
    //            return setIthBit(n,i);
    //        }
            n=clearIthBit(n,i);
            return n|(1<<i);
        }
        public static void main(String[] args) {
            System.out.println(updateIthBit(10,2,1));
        }
    }