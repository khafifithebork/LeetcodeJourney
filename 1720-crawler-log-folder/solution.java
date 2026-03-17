class Solution {
    public int minOperations(String[] logs) {
        int res = 0;
        for(String log : logs){
            if(log.equals("./")){
                continue;
            }
            if(log.equals("../")){
                if(res > 0) res--;
            }
            else{
                res++;
            }
        }
        return res;
    }
}
