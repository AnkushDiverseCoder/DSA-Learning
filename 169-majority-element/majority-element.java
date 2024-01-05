class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                res = nums[i];
            }
            if (nums[i] != res) {
                count = count - 1;
            } else {
                count = count + 1;
            }
        }
        return res;
    }
}