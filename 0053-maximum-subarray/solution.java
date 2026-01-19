class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = nums[0];
        int ans = nums[0];
        for(int i = 1; i<nums.length;i++){
            
            if(currentsum < 0){
                currentsum=0;
            }
            
            currentsum += nums[i];

            if(currentsum > ans){
            ans = currentsum;
            }
        }
        return ans;
    }
}
