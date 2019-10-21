public class Solution {
    /**
     * @param str: A string
     * @return: A string
     */
    public String lowercaseToUppercase2(String str) {
        // write your code here
        String r = new String() ;
        for (int i = 0; i < str.length(); i++)
        if(str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z'){
            char replace = (char)(str.charAt(i) - 32);
            r +=Character.toString(replace);
        } else{
            r += Character.toString(str.charAt(i));
        }
        return r;
    }
}
