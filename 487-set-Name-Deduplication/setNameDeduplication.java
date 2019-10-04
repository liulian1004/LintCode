public class Solution {
    /**
     * @param names: a string array
     * @return: a string array
     */
    public List<String> nameDeduplication(String[] names) {
        // write your code here
    //     Map<String, Integer> map = new HashMap<String, Integer>();
    //     List<String> res = new ArrayList<>();
    //     for (int i = 0; i < names.length; i++) {
    //         String str = names[i].toLowerCase();
    //         if(!map.containsKey(str)) {
    //             map.put(str,1);//why?
    //             res.add(str);
    //         }

    //     }
    //     return res;
    // }

    Set<String> set = new HashSet<>();
    List<String> res = new ArrayList<>();
    for (String s : names) {
        String ls = s.toLowerCase();
        if(!set.contains(ls) ) {
             set.add(ls);
             res.add(ls);
        }
     }
    return res;
}
}
