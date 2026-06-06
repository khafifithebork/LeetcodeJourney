class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] leftSum =new int[n];
        int[] rightSum = new int[n];
        leftSum[0] = 0;
        rightSum[n-1] = 0;
        for(int i=1;i<n;i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        for(int j=n-2;j>=0;j--){
            rightSum[j] = rightSum[j+1] + nums[j+1];
        }
        for(int k=0;k<n;k++){
            ans[k] = Math.abs(leftSum[k] - rightSum[k]);
        }
        return ans;
    }
}
