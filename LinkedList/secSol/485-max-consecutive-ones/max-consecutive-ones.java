class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        int i =0;
        while(i<nums.length){
            if(nums[i] == 1 ){
                count++;
            }else{
               if(max < count ){
                max = count;
               }
               count =0;
            }
            i++;
        }
        return Math.max(count , max);
    }
}