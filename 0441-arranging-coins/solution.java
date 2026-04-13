class Solution {
    public int arrangeCoins(int n) {
        long min = 1, max = n;
        while(min<=max){
            long mid = (min+max)/2;
            long sum = (mid*(mid+1))/2;
            if(sum == n){
                return (int)mid;
            }
            else if(sum<n){
                min = mid+1;
            }
            else if(sum>n){
                max = mid - 1;
            }
        }
        return (int)max;
    }
}
