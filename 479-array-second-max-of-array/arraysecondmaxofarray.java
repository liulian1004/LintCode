public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here

         for (int i = 0; i < nums.length - 1; i++) {
            int maxIndex = i;
            for (int j = i+1 ; j < nums.length; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }

        return nums[1];
    }
}
