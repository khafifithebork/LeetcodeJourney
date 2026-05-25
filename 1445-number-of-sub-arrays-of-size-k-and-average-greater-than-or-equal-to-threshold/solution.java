class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        int avg =0, sum =0;
        for(int i =0;i<k;i++){
            sum +=arr[i];
        }
        avg = sum / k;
        if(avg>=threshold) ans++;
        for(int R = k; R<arr.length;R++){
            sum+=arr[R];
            sum -= arr[R-k];

            if(sum >= threshold*k) ans++;
        }
        return ans;
    }
}
