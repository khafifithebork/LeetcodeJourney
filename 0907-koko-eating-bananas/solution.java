class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1, max = Arrays.stream(piles).max().getAsInt();
        while(min < max){
            int mid = (min + max)/2;
            if(canFinish(mid, piles, h)) max = mid;
            else if(!canFinish(mid, piles, h)) min = mid+1;
        }
        return min;
    }
    public boolean canFinish(int k, int[] piles, int h){
        int hoursNeeded = 0;
        for(int p : piles){
            hoursNeeded += (p + k -1)/k;
        }
        return hoursNeeded <= h;
    }
}
