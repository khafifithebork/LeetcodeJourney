class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cFive = 0, cTen = 0;
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5) cFive++;
            if(bills[i] == 10){
                cFive--;
                cTen++;
                if(cFive < 0) return false;
            }
            if(bills[i] == 20){
                if(cTen > 0 && cFive > 0){
                    cTen--;
                    cFive--;
                    if(cFive < 0) return false;
                }
                else if(cTen == 0) {
                    cFive = cFive -3;
                    if(cFive < 0) return false;
                }
                else return false;
            }
        }
        return true;
    }
}
