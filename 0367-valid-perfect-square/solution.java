class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long min = 0, max = num;
        while(min <= max){
            long mid = (min+max)/2;
            if(mid*mid == num) return true;
            else if(mid*mid < num) min = mid + 1;
            else if(mid*mid > num) max = mid - 1;
        }
        return false;
    }
}
