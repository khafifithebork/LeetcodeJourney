class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum += nums[i];
            int remain = sum%k;
            if(map.containsKey(remain)){
                if(i-map.get(remain) >= 2) return true;
            }
            else map.put(remain, i);
        }
        return false;
    }
}
