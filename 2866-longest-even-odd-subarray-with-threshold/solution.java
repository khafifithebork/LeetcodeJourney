class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0, i =0;
        while(i< nums.length){
            if(nums[i] > threshold || nums[i]%2>0){
                i++;
                continue;
            }
            int j = i+1;
            int mod = nums[i]%2;
            while( j<nums.length && nums[j] <= threshold && nums[j] %2 != mod){
                mod = nums[j]%2;
                j++;
            }
            max = Math.max(j-i,max);
            i=j;
        }
        return max;
    }
}
