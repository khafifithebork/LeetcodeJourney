class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0; i<nums.length;i++){
            nums[i]=square(nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
    public int square(int n){
        n = n*n;
        return n;
    }
}
