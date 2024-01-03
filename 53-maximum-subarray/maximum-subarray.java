class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int count =0;
        int negativeMax =Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){
                count ++;
            }
            if(nums[i]>negativeMax){
                negativeMax =nums[i];
            }
        }
        if(count==0){
            return negativeMax;
        }
        for(int i=0; i<nums.length;i++){
            currsum+= nums[i];
            if(currsum <= 0){
                currsum = 0;
            }
            if(maxsum<currsum){
                maxsum = currsum;
            }
        }
        return maxsum;
    }
}