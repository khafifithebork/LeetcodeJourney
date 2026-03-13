class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if(k==0){
            return result;
        }
        int left = 0;
        int curSum=0;
        if (k > 0) {
            int right = 1;
            // build initial window
            for (int j = 1; j <= k; j++) curSum += code[j];
            // slide
            for (int i = 0; i < n; i++) {
                result[i] = curSum;
                curSum += code[(right + k) % n];
                curSum -= code[right % n];
                right++;
            }
        }
        if(k<0){
            for(int j = n+k; j <n;j++) curSum += code[j];
            for(int i = 0; i<n; i++){
                result[i] = curSum;
                curSum += code[(i + n) % n];
                curSum -= code[(i + n + k) % n];
            }
        }
        return result;
    }

}
