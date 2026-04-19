class Solution {
    public int waysToSplitArray(int[] nums) {
        long totSum = 0;
        for (int num : nums) {
            totSum += num;
        }
        long left = 0;
        long count = 0;
        for(int i =0;i<nums.length-1;i++){
            left += nums[i];
            if(left*2>=totSum){
                count++;
            }
        }
        return (int)count;
    }
}
