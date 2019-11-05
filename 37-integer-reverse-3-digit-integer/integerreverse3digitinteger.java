public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {

        int dig1= number%10;
        int dig2 = (number/10)%10;
        int dig3 = number/100;

        return dig1*100 + dig2*10 + dig3;

    }
}
