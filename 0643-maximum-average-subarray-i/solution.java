class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = 0;
        double d = k;
        for(int i=0; i < k; i++){
            sum+=nums[i];
            max = sum;
        }
        for(int left=1; left <= nums.length-k; left++){
            sum = sum - nums[left-1] + nums[left+k-1];
            if(sum > max){
                max = sum;
            }
        }
        return (double) max/d;

    }
}
