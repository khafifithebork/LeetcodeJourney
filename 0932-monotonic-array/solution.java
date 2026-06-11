class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean isInc = true;
        boolean isDec = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]) isDec = false;
            if(nums[i] > nums[i+1]) isInc = false;

            if(isDec==false && isInc==false) return false;
        }
        return isDec || isInc;
    }
}
