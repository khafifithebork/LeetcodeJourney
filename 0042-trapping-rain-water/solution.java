class Solution {
    public int trap(int[] height) {
        int total =0;
        int left=0, right = height.length-1;
        int mR=0, mL=0;
        while(left<right){
            mL = Math.max(mL,height[left]);
            mR = Math.max(mR,height[right]);
            if(mL < mR){
                total += mL - height[left];
                left++;
            }
            else{
                total += mR - height[right];
                right--;
            }
        }
        return total;
    }
}
