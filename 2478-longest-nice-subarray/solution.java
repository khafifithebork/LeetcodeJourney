class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l=0;
        int state=0;
        int maxLen=0;
        for(int r=0;r<nums.length;r++){
            while((state & nums[r]) != 0){
                state ^= nums[l];
                l++;
            }
            state |= nums[r];
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
