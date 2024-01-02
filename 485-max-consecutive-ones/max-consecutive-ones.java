class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      // Initialize variables to track the maximum count and current count of consecutive 1s
        int maxCount=0;
        int curCount=0;
          for(int element: nums)
        {
            if(element==0)
            {
        //reset curCount and maxCount whenever 0 is encountered.
                if(maxCount<curCount)
                {
                    maxCount=curCount;
                }
                curCount=0;                
            }
            else
            {
                curCount++;
            }
        }
        // After the loop, compare the final current count with the maximum count and return the larger value
        return maxCount>curCount? maxCount:curCount;
        
        // Approach Brute Force

        // int count =0;
        // for(int i=0;i<nums.length;i++){
        //     int currEle = nums[i];
        //     if(currEle != 1){
        //         nums[i]= count;
        //         count = 0;
        //     }else{
        //         count= count+1;
        //     }
        //     if(i == nums.length-1 ){
        //         nums[i]=count;
        //     }
        // }
        // int max = 0;
        // for(int i =0; i<nums.length;i++){
        //     if(nums[i]>max){
        //         max = nums[i];
        //     }
        // }
        // return max;
    }
}