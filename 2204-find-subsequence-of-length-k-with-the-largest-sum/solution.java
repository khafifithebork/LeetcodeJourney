class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] pairs = new int[nums.length][2];
        int[][] needed = new int[k][2];
        int[] res = new int[k];
        for(int i=0;i<nums.length;i++){
            pairs[i][1]=i;
            pairs[i][0]=nums[i];
        }
        int r=nums.length-k;
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        for (int j = 0; j < k; j++) {
            needed[j] = pairs[nums.length - k + j];
        }
        Arrays.sort(needed, (a, b) -> a[1] - b[1]);
        for(int p=0;p<k;p++){
            res[p]=needed[p][0];
        }
        return res;
    }
}
