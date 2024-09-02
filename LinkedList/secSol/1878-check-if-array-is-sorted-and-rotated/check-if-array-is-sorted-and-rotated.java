class Solution {
    public boolean check(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int flag = 0;
        for(int i =0 ; i< nums.length;i++){
          if(nums[i] > nums[(i+1)%nums.length]){
            flag+=1;
          }
        }

        return flag <2;
    }
}