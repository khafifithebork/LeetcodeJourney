class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder merged = new StringBuilder("");
        int n = Math.max(word1.length(), word2.length());
        for(int i =0; i<n;i++){
            if( i < word1.length() ){
                merged.append(word1.charAt(i));
            }
            if( i < word2.length() ){
                merged.append(word2.charAt(i));
            }
        }
        String result = merged.toString();
        return result;


    }
}
