/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long min = 1, max = n;
        long mid =1;
        while(min<=max){
            mid = (min+max)/2;
            if(guess((int)mid) == 0){
                return (int)mid;
            }
            else if(guess((int)mid) == 1){
                min = mid+1;
            }
            else if(guess((int)mid) == -1){
                max = mid-1;
            }
        }
        return (int)mid;
    }
}
