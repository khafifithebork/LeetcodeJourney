class Solution {
    public int longestPalindrome(String s) {
        boolean odds = false;
        int[] totCount = new int[58];
        int ans=0;
        int n = s.length();
        for(char c : s.toCharArray()){
            totCount[c-'A']++;
        }
        for(int count : totCount){
            if(count%2==0){
                ans+=count;
            }
            else{
                if( (count - 1) % 2 == 0){ 
                    odds=true;
                    ans += count - 1;
                }
            }
        }
        return (odds==true) ? ans+1 : ans;
    }
}
