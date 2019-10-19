public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        if (A == null ) {
            return B;
        }
        if (B == null) {
            return A;
        }
        int n = A.length + B.length;
        int[] res = new int[n];
        int j = 0, k = 0;
        for (int i = 0; i< n; i++){
         if (j < A.length && (k >= B.length ||A[j] <= B[k] ) ){
             res[i] = A[j];
             j++;//两种形式皆可
         } else {
             res[i] = B[k++];
         }
        }
        return res;

    }
}
