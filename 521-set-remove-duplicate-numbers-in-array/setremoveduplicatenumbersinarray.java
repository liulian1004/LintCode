public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        // int k = 0;
        // int end = 0;
        // for (int i = 0; i<nums.length -end - 1; i++){
        //     for(int j = i + 1; j <nums.length-end;){
        //         if (nums[i] == nums[j] ){
        //             // k++;
        //             int temp = nums[j];
        //             for (int k=j+1; k<nums.length-end; k++) {
        //                 nums[k-1] = nums[k];
        //             }
        //             nums[nums.length-end-1] = temp;
        //             end++;
        //             //nums[j] = '/';
        //         }else{
        //             j++;
        //         }
        //     }
        // }
        // return nums.length-end;

        int valid = 0;
        int cur = 0;
        Set<Integer> set = new HashSet<>();
        while (cur < nums.length) {
            // System.out.println(isDistinct(set, nums[cur]));
            if (isDistinct(set, nums[cur])) {
                nums[valid] = nums[cur];
                valid++;
            }
            cur++;
        }
        return valid;
    }

    private static boolean isDistinct(Set<Integer> set, int i) {
        boolean res = set.contains(i);
        if (!res) {
            set.add(i);
        }
        return !res;
    }

       // return nums;//how to return int[]
        //return Arrays.toString(nums);

    //     return  (nums.length-k);
    // }
}
