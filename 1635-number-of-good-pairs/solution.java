class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq  = new int[101];
        int ans=0;
        for(int num : nums){
            freq[num]++;
        }
        for(int val : freq){
            if(val > 1) ans += (val*(val-1))/2;
        }
        return ans;
    }
}
