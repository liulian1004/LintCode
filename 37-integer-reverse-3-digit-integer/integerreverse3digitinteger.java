public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        //Scanner input = new Scanner(System.in);
        //int a = input.nextInt();
        int a = number;
        int reverse = 0;
        int dig1= a % 10;
        int dig2 = (a/10);
        int dig3 = a/100;
        reverse = dig1*100 + dig2*10 + dig3;
        return reverse;
    }
}
