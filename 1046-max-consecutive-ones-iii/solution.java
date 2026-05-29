class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int state = 0;
        int maxLen = 0;
        for(int r=0;r<nums.length;r++){
            if(nums[r] == 0){
                state++;
            }
            while(state>k){
                if(nums[l] == 0){
                    state--;
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
