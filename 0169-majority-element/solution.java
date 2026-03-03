class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int c = 1, res = 0, n =nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                c++;
                res = nums[i];
            }
            else if(nums[i]!=nums[i-1] && c < n/2){
                c=1;
                res = nums[i];
            }
            else if(c > n/2){
                return res;
            }
        }
        return res;
    }
}
