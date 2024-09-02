class Solution {
    public boolean check(int[] nums) {
        if(nums.length == 1){
            return true;
        }
         for(int i =0 ; i< nums.length;i++){
            int index = i;
            boolean flag = false;
            for(int j =0 ; j<nums.length-1; j++){
                if(nums[index] <= nums[(index+1)% nums.length]){
                    index = (index+1) % nums.length;
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag == true ){
                return true;
            }
        }

        return false;
    }
}