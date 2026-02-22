class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        int slow = n, fast = sumsq(n);
        while(slow!=fast){
            slow = sumsq(slow);
            fast = sumsq(sumsq(fast));
            if(slow == 1 || fast == 1){
                return true;
            }
        }
        return false;
    }
        
    public int sumsq(int n){
        int ans=0;
        while(n>0){
            int x = n % 10;
            ans += x * x;
            n = n/10;
        }
        return ans;
        }
}
