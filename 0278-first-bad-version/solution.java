/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long min = 1, max = n;
        while(min <= max){
            long mid = (min+max)/2;
            if(isBadVersion((int)mid)){
                max = mid - 1;
            }
            else if(!isBadVersion((int)mid)){
                min = mid + 1;
            }
        }
        return (int)min;
    }
}
