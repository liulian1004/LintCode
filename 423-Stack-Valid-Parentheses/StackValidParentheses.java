public class Solution {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // write your code here
        int i;
        int n = s.length();
        Stack<Character> que = new Stack<> ();
        if (s == null || n % 2 == 1){
            return false;
        }
        for (i =0; i<n; i++ ) {
            char ch = s.charAt(i);
            if( ch == '[' || ch == '{' || ch == '(' ){
                que.push(ch);
                continue;
            }
            if (ch == ']') {
                if (!que.isEmpty() && que.pop() == '[') {
                    continue;
                }else {
                return false;}
            }
            if (ch == '}') {
                if (!que.isEmpty() && que.pop() == '{') {
                    continue;
                }else {
                return false;}
            }
            if (ch == ')') {
                if (!que.isEmpty() && que.pop() == '(') {
                    continue;
                }else {
                return false;}
            }
        }
        // if (que.isEmpty() ) {
        //     return true;
        //     }
        //     else {
        //     return false;
        //     }
        return que.isEmpty();
    }
}
