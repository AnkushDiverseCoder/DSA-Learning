class Solution {
    public int[] sortedSquares(int[] A) {
      int[] res = new int[A.length];
       int start = 0, end = A.length-1;
       int resIndex = A.length-1;
       
       while(start <= end){
           if(A[start]*A[start] > A[end]*A[end]){
               res[resIndex--] = A[start]*A[start];
               start++;
           }else{
               res[resIndex--] = A[end]*A[end];
               end--;
           }
       }
       
       return res;
    }
}