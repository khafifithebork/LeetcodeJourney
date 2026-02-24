class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder(s);
        int j =0, c=0;
        for(int i = 0;i<spaces.length;i++){
            j=spaces[i]+c;
            str.insert(j, " ");
            c++;
        }
        String ans = str.toString();
        return ans;
    }
}
