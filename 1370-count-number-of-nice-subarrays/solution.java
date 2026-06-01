class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums,k-1);
    }
    public int atMost(int[] arr, int k){
        int l=0;
        int count=0;
        int odds =0;
        for(int r=0; r<arr.length;r++){
            odds += (arr[r] % 2 != 0) ? 1 : 0;
            while(odds > k){
                if (arr[l] % 2 != 0) odds--;
                l++;
            }
            count += r-l+1;
        }
        return (int)count;
    }
}
