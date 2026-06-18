class Solution {
    public double angleClock(int hour, int minute) {
        double hourAngle = (hour%12) * 30.0 + minute * 0.5;
        double minuteAngle = minute * 6.0;
        double diff = Math.abs(hourAngle - minuteAngle);
        double minDiff = Math.min(diff, 360-diff);
        return minDiff;
    }
}
