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
//soultion 2
public int[] mergeSortedArray(int[] A, int[] B) {
       // write your code

       int[] res = new int[A.length + B.length];//定义res长度
       if(A == null) {
           //res = B;
           return res = B;
       }
       if(B == null) {
           res = A;
           return res;
       }
       int i = 0;//A 指针
       int j = 0;//B 指针
       int k = 0;// res 指针
       while (i< A.length || j<B.length){
           if(i<A.length && (j>=B.length || A[i]<=B[j])){//需要考虑i，j走到边界的问题
               res[k] = A[i];
               i++;
           } else{
               res[k] = B[j];
               j++;
           }
           k++;
       }
       return res;
   }
}
