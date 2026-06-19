class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstIndex = new int[26];
        int maxLen = -1;
        Arrays.fill(firstIndex, -1);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int idx = c - 'a';
            if(firstIndex[idx] == -1){
                firstIndex[idx] = i;
            }
            else{
                int len = i - firstIndex[idx]-1;
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
