public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>(); //1st Integer = val, 2nd Integer = position
        for(int i = 0 ; i< numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                int[] res = {map.get(target-numbers[i])/*return position number*/,i};
                return res;
            }
            else{
                map.put(numbers[i],i);
            }
        }
        //走到这里没有返回，说明没有值符合
        //return null;
        return new int[]{};
        //以上两个表达式都可以，具体是要看前期定义，在写程序时要定义为null时，返回null,还是new int[]{}
    }
}
