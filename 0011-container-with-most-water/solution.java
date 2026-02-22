class Solution {
    public int maxArea(int[] height) {
        int  n = height.length;
        int left =0, right = n-1;
        int curr=0, area=0;
        while(left<right){
            int dis = right-left;
            curr = dis * Math.min(height[left], height[right]);
            area = Math.max(area, curr);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}
