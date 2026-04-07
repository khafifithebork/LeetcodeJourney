class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 1;
        Set<Integer> set = new HashSet<>();
        if(nums.length == 0) return 0;
        for(int num : nums){
            set.add(num);
        }
        for(int n : set){
            if(!set.contains(n-1)){
                int curr = 1;
                while(set.contains(n+1)){
                    n++;
                    curr++;
                    res = Math.max(res, curr);
                }
            }
        }
        return res;
    }
}
