public class StaircaseSearch {
    public static boolean staircaseSearch(int[][] n,int key){
        //int row=n.length-1;
        //int col=0;
        //while(row>=0 && col<n.length){
        int row=0;
        int col=n[0].length-1;
        while(row<n.length && col>=0){
            if(n[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                return true;
            }
            //else if(n[row][col]>key){
            //    row--;
            //}
            else if(n[row][col]>key){
                col--;
            }
            //else{
            //    col++;
            //}
            else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String[] args) {
        int n[][]={{10,20,30,40},
                   {15,25,35,45},
                   {27,29,37,48},
                   {32,33,39,50}};
        int key=33;
        staircaseSearch(n,key);
    }
}
