class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder("");
        for(char c : s.toCharArray()){
            if(c=='*'){
                stack.pop();
            }
            else stack.push(c);
        }
        for(char t : stack){
            res.append(t);
        }
        return res.toString();
    }
}
