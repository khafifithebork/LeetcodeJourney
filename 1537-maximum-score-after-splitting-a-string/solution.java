class Solution {
    public int maxScore(String s) {
        int totOnes = 0;
        int n = s.length();
        for(char c : s.toCharArray()){
            if(c =='1') totOnes++;
        }

        int maxScore =0;
        int zeroLeft = 0;

        for(int i=0;i<n-1;i++){ 
            if(s.charAt(i) == '0') zeroLeft++;
            if(s.charAt(i) == '1') totOnes--;
            int currScore = zeroLeft + totOnes;
            maxScore = Math.max(maxScore, currScore);
        }
        return maxScore;
    }
}
