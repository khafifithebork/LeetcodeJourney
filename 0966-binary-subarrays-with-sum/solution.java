class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }

    public int atMost(int[] arr, int k){
        if(k < 0) return 0;
        int count=0,sum=0,l=0;
        for(int r =0;r<arr.length;r++){
            sum+=arr[r];
            while(sum > k){
                sum-=arr[l];
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}
