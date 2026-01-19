class Solution {
    public int maxProduct(int[] nums) {
        int minP=nums[0];
        int maxP=nums[0];
        int Result=nums[0];
        if (nums.length==0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<0) {

                int temp = maxP;
                maxP=Math.max(nums[i]*minP, nums[i]);
                minP = Math.min(temp * nums[i], nums[i]);
            }
            else{
                maxP=Math.max(nums[i], maxP*nums[i]);
                minP=minP*nums[i];
            }
        
            Result=Math.max(maxP, Result);
        }

        return Result;

    }
}
