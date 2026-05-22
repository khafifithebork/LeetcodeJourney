class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = 0, maxLen = 0;
        for(int right = 1; right<nums.length;right++){
            while(nums[right] -nums[left] > 1){
                left++;
            }
            if(nums[right]-nums[left] == 1){
                maxLen = Math.max(maxLen, right-left +1);
            }
        }
        return maxLen;
    }
}
