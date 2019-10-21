public class Solution {
    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
        String[] a = Integer.toString(num).split("");
        boolean result = true;
        for (int i = 0 ; i < a.length/2; i++){
            if (a[i].equals(a[a.length -1- i])){
                continue;
            }else {
                result = false ;
                break;
            }

        }
        return result;
    }
}
