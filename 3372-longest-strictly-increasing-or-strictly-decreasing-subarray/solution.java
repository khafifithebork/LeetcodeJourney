class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int countInc=1;
        int streakInc=1;
        int countDec=1;
        int streakDec=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                streakInc++;
                countInc = Math.max(countInc,streakInc);
            }
            else streakInc=1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                streakDec++;
                countDec = Math.max(countDec,streakDec);
            }
            else streakDec=1;
        }
        return Math.max(countDec,countInc);
    }
}
