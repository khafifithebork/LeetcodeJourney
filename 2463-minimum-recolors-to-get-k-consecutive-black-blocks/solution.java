class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0, right = k;
        int maxB = 0;

        for(int j=0;j<k;j++){
            if(blocks.charAt(j)=='B'){
                maxB++;
            }
        }
        int curB=maxB;
        for(int i = k; i<blocks.length(); i++){
            if(blocks.charAt(i) == 'B'){
                curB++;
            }
            if(blocks.charAt(left) == 'B'){
                curB--;
            }
            left++;
            maxB = Math.max(curB,maxB);
        }
        return Math.abs(maxB-k);

    }
}
