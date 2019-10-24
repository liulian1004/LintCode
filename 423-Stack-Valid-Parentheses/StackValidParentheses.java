public class Solution {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // write your code here
        if(s == null ||s.length() % 2 ==1){//首先排除掉一定不可能的情况
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ;i<s.length();i++) {
            char c = s.charAt(i);
            if (c =='(' || c == '[' || c== '{') {
            stack.push(c);
            }
            if( c == ')') {
                if(!stack.isEmpty() && stack.pop() == '('){//考虑到空指针情况出现，首先要判断出stack时候为空
                    continue;
                } else {
                    return false;
                }
            }
            if( c == ']') {
                if(!stack.isEmpty() && stack.pop() == '['){
                    continue;
                } else {
                    return false;
                }
            }
            if( c == '}') {
                if(!stack.isEmpty() && stack.pop() == '{'){
                    continue;
                } else {
                    return false;
                }
            }

        }
        // if(stack.isEmpty()){//最后还需要判断stack是否都弹出，ex “（（”
        //     return true;
        // } else{
        //     return false;
        // }
        return stack.isEmpty();
    }
}
