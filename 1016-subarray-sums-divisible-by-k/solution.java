class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0, count =0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int remain = ((sum % k) + k) % k;
            if(map.containsKey(remain)){
                count += map.get(remain);
                map.put(remain, map.getOrDefault(remain,0)+1);
            }
            else map.put(remain, 1);
        }
        return count;
    }
}
