class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long currSum=0, maxSum=0;
        int start = 0;
        for(int end=0; end<nums.length; end++){
            while(set.contains(nums[end])||set.size()==k){
                set.remove(nums[start]);
                currSum-=nums[start];
                start++;
            }
            set.add(nums[end]);
            currSum+=nums[end];
            if(set.size()==k){
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }
}
