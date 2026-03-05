public class Palindrome {
    public static boolean isPalindrome(String n){
        for(int i=0;i<n.length()/2;i++){
            int m=n.length();
            if(n.charAt(i) != n.charAt(m-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String n="racecar";
        System.out.println(isPalindrome(n));
    }
}
