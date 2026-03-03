class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while(columnNumber > 0){
            if(columnNumber%26==0){
                s.append('Z');
                columnNumber = columnNumber / 26 - 1;
            }
            else{
                s.append((char)('A'+ columnNumber%26 -1));
                columnNumber = columnNumber / 26;
            }
        }
        s.reverse();
        String res = s.toString();
        return res;
    }
}
