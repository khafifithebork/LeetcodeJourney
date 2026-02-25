class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int temp = nums[i]; 
            nums[i] = nums[i-1];        
            nums[i-1] = temp;
            i++;
        }
        return nums;
    }
}
