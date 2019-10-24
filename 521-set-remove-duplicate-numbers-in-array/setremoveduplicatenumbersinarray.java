public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {

        int valid = 0;
        int cur = 0;
        Set<Integer> set = new HashSet<>();
        while (cur < nums.length) {
            if (isDistinct(set, nums[cur])) {//set中没有这个数，自己做的method
                nums[valid] = nums[cur];//re-fresh nums
                valid++;//valid only move when the figure is unique
            }
            cur++;//cur always move to the next one
        }
        return valid;
    }

    private static boolean isDistinct(Set<Integer> set, int i) {
        boolean res = set.contains(i);//check if it contains i
        if (!res) {
            set.add(i);//if not ,add i into set;
        }
        return !res;
    }
}
