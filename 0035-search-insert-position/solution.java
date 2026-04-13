class Solution {
    public int searchInsert(int[] nums, int target) {
        int min = 0, max = nums.length-1;
        int mid = (min+max)/2;
        while(min <= max){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                min = mid+1;
                mid = (min+max)/2;
            }
            else if(nums[mid]>target){
                max = mid-1;
                mid = (min+max)/2;
            }

        }
        return min;
    }
}
