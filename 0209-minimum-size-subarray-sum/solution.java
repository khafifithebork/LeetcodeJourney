class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int ans=0, curr=0;
        int minLen = Integer.MAX_VALUE;
        for(int end=0; end<nums.length;end++){
            curr+=nums[end];
            while(curr>=target){
                if(end-start+1<minLen){
                    minLen=end-start+1;
                }
                curr-=nums[start];
                start++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}
