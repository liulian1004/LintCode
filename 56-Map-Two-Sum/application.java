public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        // int n = numbers.length;
        // int[] res = new int[2];
        // for (int i =0; i<n-1; i++){
        //     for(int j =i+1; j<n;j++){
        //         if(numbers[i]+numbers[j] == target) {
        //             res[0]= i;
        //             res[1] = j;

        //         }
        //     }
        // }
        // return res;
        Map<Integer,Integer> map = new HashMap<>() ; //1st Integer = val, 2nd Integer = position
        for (int i = 0 ; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])) {
                int[] res = {map.get(target - numbers[i]), i};//target - numbers[i] is previous than numbers[i]
                return res;
            } else {
                map.put(numbers[i],i);//if not matches, put on map for later checking
            }
        }
        return new int[]{};
    }
}
