class Solution {
    public int pivotIndex(int[] nums) {
        int tot = 0;
        for(int n : nums) tot += n;
        int leftSum =0;
        for(int i = 0; i < nums.length; i++){
            if(leftSum == tot - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
