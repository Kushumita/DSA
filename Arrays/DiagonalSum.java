public class DiagonalSum {
    public static int diagonalSum(int[][] n){
//       int sum=0;
//      for(int i=0;i<n.length;i++){
//        for(int j=0;j<n[0].length;j++){
//          if(i==j){
//            sum+=n[i][j];
//      }
//            else if(i+j==n.length-1){
//              sum+=n[i][j];
//       }
//    }
//  }
//       return sum;
//}
         int sum=0;
         for(int i=0;i<n.length;i++){
            //Primary Diagonal
            sum+=n[i][i];
            //Secondary Diagonal
            if(i!=n.length-1-i){
                sum+=n[i][n.length-1-i];
            }
         }
         return sum;
        }
    public static void main(String[] args) {
        int n[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(n));
    }
}
