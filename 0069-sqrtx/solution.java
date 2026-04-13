class Solution {
    public int mySqrt(int x) {
        long min =0, max =x;
        while(min<=max){
            long mid = (max+min)/2;
            if(mid*mid == x) return (int)mid;
            else if(mid*mid < x) min = mid+1;
            else if(mid*mid > x) max= mid-1;
        }
        return (int)max;
    }
}
