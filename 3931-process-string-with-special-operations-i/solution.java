class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '*'){
                if(!sb.isEmpty()){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else if(c =='#'){
                String copy = sb.toString();
                sb.append(copy);
            }
            else if(c=='%'){
                sb.reverse();
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
