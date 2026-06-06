class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int ans=0;
        int[] prefix = new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1] ^= prefix[i]^arr[i];
        }
        for(int i=0;i<n;i++){
            int xor = 0;
            for (int k = i; k < n; k++) {
                xor ^= arr[k];
                if (xor == 0) ans += k - i;
            }
        }
        return ans;
    }
}
