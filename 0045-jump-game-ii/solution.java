class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int maxJump = 0, end = 0, ans = 0;
        for(int i = 0;i<nums.length;i++){
            maxJump = Math.max(maxJump, nums[i]+i);
            if(maxJump >= nums.length-1){
                ans++;
                return ans;
            }
            if(i == end){
                end = maxJump;
                ans++;
            }
        }
        return ans;
    }
}
