class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        char[] tarr = t.toCharArray();
        char[] sarr = s.toCharArray();
        Arrays.sort(tarr);
        Arrays.sort(sarr);

        for(int i=0; i<sarr.length; i++){
            if(sarr[i] != tarr[i]){
                return false;
            }
        }
        return true;
    }
}
