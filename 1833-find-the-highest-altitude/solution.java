class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefixSum = new int[gain.length+1];
        prefixSum[0] = 0;
        int ans=0;
        for(int i=1;i<=gain.length;i++){
            prefixSum[i] = prefixSum[i-1] + gain[i-1];
            ans = Math.max(ans,prefixSum[i]); 
        }
        return ans;
    }
}
