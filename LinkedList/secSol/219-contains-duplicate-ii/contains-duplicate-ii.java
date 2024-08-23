class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(num)) return true;
            set.add(num);
            if (set.size() > k) set.remove(nums[i - k]); 
        }
        return false;
    }
}