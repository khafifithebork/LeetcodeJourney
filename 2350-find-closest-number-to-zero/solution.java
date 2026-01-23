class Solution {
    public int findClosestNumber(int[] nums) {
        int dis = nums[0];
        int ans = 0;
        for(int i =0; i<nums.length; i++){
            if(Math.abs(dis) > Math.abs(nums[i])){
                dis=nums[i];
                ans=dis;
            }else if(Math.abs(dis)==Math.abs(nums[i])){
                ans = Math.max(dis, nums[i]);
            }
            
        }
        return ans;
    }
}
