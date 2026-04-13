class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = Arrays.stream(weights).max().getAsInt();
        int max = Arrays.stream(weights).sum();
        while(min <= max){
            int mid = (max+min)/2;
            if(!canShip(weights ,mid, days)){
                min=mid+1;
            }
            else max = mid-1;
        }
        return min;
    }
    public boolean canShip(int[] weights,int cap, int days){
        int dayCount=1, currload=0;
        for(int w : weights){
            if(w + currload > cap){
                currload =w;
                dayCount++;
            }
            else currload += w;
        }
        if(dayCount <= days) return true;
        else return false;
    }
}
