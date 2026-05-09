class Solution {
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length-1;
        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums ,mid, right);
                right--;
            }
            else mid++;
        }
    }
   
   
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
