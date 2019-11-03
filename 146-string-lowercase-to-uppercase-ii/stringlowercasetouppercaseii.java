public class Solution {
    /**
     * @param str: A string
     * @return: A string
     */
     //string
    public String lowercaseToUppercase2(String str) {
        // write your code here
        String r = new String() ;
        // r是一个空string，r+会产生一个新的string，名字也是r, 但是是新开的空间，原来的空间会被收回，所以一般都用stingbuilder

        STRING R = "";
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
//sringbuilder
public class Solution {
    /**
     * @param str: A string
     * @return: A string
     */
    public String lowercaseToUppercase2(String str) {
        // write your code here
      StringBuilder sb = new StringBuilder();
      for(int i = 0 ; i<str.length();i++){
          if(str.charAt(i)>='a' && str.charAt(i) <='z'){
              sb.append((char)(str.charAt(i)-('a'-'A')));//转化成char
          }else{
              sb.append(str.charAt(i));
          }
      }
          return ""+sb;
    }
}
