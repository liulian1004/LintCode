public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
    String newS = s.replaceAll("[^a-zA-Z0-9]", "");
    if(newS == null || newS.length() == 0){
        return true;
    }
     newS = newS.toLowerCase();
    int i = 0;
    int j = newS.length()-1;
    while(i<j){
        if(newS.charAt(i) == newS.charAt(j)){
            i++;
            j--;
        }else{
            break;//跳出程序
        }
    }
    return i>=j; //如果指针都走到相应地点，要么i和j重合，要么i超过j一位
    }
}
