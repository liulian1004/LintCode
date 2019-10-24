public class Solution {
    /**
     * @param names: a string array
     * @return: a string array
     */
    public List<String> nameDeduplication(String[] names) {
    Set<String> set = new HashSet<>();
    List<String> res = new ArrayList<>();
    for (String s : names) {//  = for (int i=0; i<names.length; i++) { String s = names[i]}
        String ls = s.toLowerCase();// string【】not function of toLowerCase,need to transfer to string
        if(!set.contains(ls) ) {
             set.add(ls);
             res.add(ls);
        }
     }
    return res;
}
}
