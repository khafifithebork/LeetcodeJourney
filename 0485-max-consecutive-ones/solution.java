class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int countmax = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==1){
                counter ++;
            }
            else{
                counter = 0;
            }
            if(counter > countmax){
                countmax = counter;
            }
        }
        return countmax;
    }
}
