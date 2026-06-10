class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid[0].length;
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int[] row : grid){
            for(int val : row){
                if(!set.contains(val)) set.add(val);
                else if(set.contains(val)) ans[0] = val;
            }
        }
        for(int i=1; i<= n*n; i++){
            if(!set.contains(i)) ans[1] = i;
        }
        return ans;
    }
}
