public class Solution {
    /**
     * @param str: A string
     * @return: An integer
     */
    public int stringToInteger(String str) {
        // write your code here
        if (str == null || str.isEmpty() ){
         return 0;
        }
        char b = str.charAt(0);
        boolean isNegative = (b == '-');
        int start = isNegative? 1:0;
        int res = 0;
        for (int i = start; i<str.length(); i++){
            char ch = str.charAt(i);
            int digit = ch -'0';
            if(!isNegative){
             res = res * 10 + digit;// when i = 1, res第一位要前进一位
            }else {
                res = res * 10 - digit;
            }// when i = 1, res第一位要前进一位
        }
       return res;
    }
}
