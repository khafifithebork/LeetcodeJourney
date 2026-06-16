class Solution {
    public String largestGoodInteger(String num) {
        char maxDigit=0;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                if(num.charAt(i) > maxDigit){
                    maxDigit = num.charAt(i);
                }
            }
        }
        if(maxDigit==0) return "";
        return "" + maxDigit + maxDigit + maxDigit;
    }
}
