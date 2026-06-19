class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int changes=0;
        for(int i=0;i<n;i++){
            char expected = (i%2==0) ? '0' : '1';
            if(s.charAt(i) != expected){
                changes++;
            }
        }
        return Math.min(changes, n - changes);
    }
}
