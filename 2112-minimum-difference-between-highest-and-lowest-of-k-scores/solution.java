class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff =Integer.MAX_VALUE;
        if(nums.length == 0 || nums.length == 1 ){
            return 0;
        }
        for(int i = 0; i<=nums.length-k;i++){
            diff = Math.min(diff, nums[i+k-1] - nums[i]);
        }
        return diff;
    }
}
