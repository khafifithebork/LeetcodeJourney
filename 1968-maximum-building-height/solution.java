class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        int[][] res = new int[restrictions.length+1][2];
        res[0] = new int[]{1,0};
        for(int i =0;i<restrictions.length;i++){
            res[i+1] = restrictions[i];
        }
        Arrays.sort(res, (a,b) -> a[0]-b[0]);
        
        //Forward pass
        for(int i=1;i<res.length;i++){
            int prevHt = res[i-1][1];
            int prevId = res[i-1][0];
            int currHt = res[i][1];
            int currId = res[i][0];

            int maxPossible = prevHt + (currId - prevId);
            if(currHt > maxPossible){
                res[i][1] = maxPossible;
            }
        }
        
        //BackwardPass
        for(int i=res.length-2;i>=0;i--){
            int nextHt = res[i+1][1];
            int nextId = res[i+1][0];
            int currHt = res[i][1];
            int currId = res[i][0];

            int maxPossible = nextHt + (nextId-currId);
            if(currHt>maxPossible){
                res[i][1] = maxPossible;
            }
        }
        int maxH =0;

        for(int i=0;i<res.length-1;i++){
            int id1 = res[i][0];
            int id2 = res[i+1][0];
            int h1 = res[i][1];
            int h2 = res[i+1][1];
            int dis = id2 - id1;
            int peak = (h1+h2+dis)/2;
            maxH = Math.max(maxH, peak);
        }
        int lastId = res[res.length-1][0];
        int lastHt = res[res.length-1][1];
        maxH = Math.max(maxH, lastHt + (n-lastId));
        return maxH;

    }
}
