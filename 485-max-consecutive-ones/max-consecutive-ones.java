class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            int currEle = nums[i];
            if(currEle != 1){
                nums[i]= count;
                count = 0;
            }else{
                count= count+1;
            }
            if(i == nums.length-1 ){
                nums[i]=count;
            }
        }
        int max = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}