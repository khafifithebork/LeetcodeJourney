class Solution {
    public int divisorSubstrings(int num, int k) {
        int ans = 0;
        String str = Integer.toString(num);
        for(int i =0;i<=str.length()-k;i++){
            String substr = str.substring(i,k+i);
            int n = Integer.parseInt(substr);
            if(n!=0 && num%n==0) ans++;
        }
        return ans;
    }
}
