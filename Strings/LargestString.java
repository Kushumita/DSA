public class LargestString {
    public static void main(String[] args) {
        String fruits[]={"Apple","Mango","Banana"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(fruits[i].compareToIgnoreCase(largest)>0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
