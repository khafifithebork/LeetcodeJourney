class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[128];
        int l=0;
        int maxLen=0;
        for(int r =0;r<s.length();r++){
            char c = s.charAt(r);
            freq[c]++;
            while(freq[c] > 2){
                freq[s.charAt(l)]--;
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}
