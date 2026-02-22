class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0; i<cleaned.length()/2;i++){
            if(cleaned.charAt(i)!=cleaned.charAt(cleaned.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
