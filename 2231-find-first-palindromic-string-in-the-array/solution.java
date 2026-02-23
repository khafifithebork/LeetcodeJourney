class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            if(isPalindrome(words[i])==true){
                return words[i];
            }
        }
        return "";
    }
    public boolean isPalindrome(String s){
        for(int i =0; i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
