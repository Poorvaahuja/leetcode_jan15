class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int med = nums[nums.length/2];
        int diff = 0;
        for(int el : nums){
            diff += Math.abs(med - el);
        }
        return diff;
    }
}
