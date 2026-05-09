class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left = i+1, right = nums.length-1;
            while(left < right){
                int sum = nums[left] + nums[i] + nums[right];
                if(Math.abs(sum - target) < Math.abs(res - target)){
                    res = sum;
                }
                if(sum == target) return target;
                else if(sum < target) left++;
                else right--;
            }
        }
        return res;
    }
}
