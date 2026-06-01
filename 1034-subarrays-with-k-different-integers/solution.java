class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    
    int atMost(int[] arr, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    int L = 0;
    long count = 0;

    for (int R = 0; R < arr.length; R++) {
        freq.merge(arr[R], 1, Integer::sum);

        while (freq.size() > k) {
            int leftVal = arr[L];
            freq.merge(leftVal, -1, Integer::sum);
            if (freq.get(leftVal) == 0) freq.remove(leftVal);
            L++;
        }
        count += R - L + 1;
    }
    return (int) count;
}
}
