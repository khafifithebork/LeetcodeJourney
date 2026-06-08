class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int currSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                currSum+=nums[i];
                sum = Math.max(currSum,sum);
            }
            else currSum=nums[i];
        }
        return sum;
    }
}
