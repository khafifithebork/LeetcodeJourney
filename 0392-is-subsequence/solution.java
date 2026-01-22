class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int subsequence = 0;
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(sarr[i]==tarr[j]){
                i++;
            }
            j++;
        }
        if(i == s.length()){
            return true;
        }
        return false;
    }
}
