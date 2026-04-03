class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        int[][] car = new int[n][2];
        for(int i = 0; i<n;i++){
            car[i][0]= position[i];
            car[i][1]=speed[i];
        }
        Arrays.sort(car,(a ,b) -> b[0]-a[0]);
        double lastime = 0;
        int fleets = 0;
        for(int j = 0; j<n;j++){
            double time = (double)(target-car[j][0])/car[j][1];
            if(time > lastime){
                fleets++;
                lastime = time;
            }
        }
        return fleets;
    }
}
