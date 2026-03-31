class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder("");
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(stack.peek()-c) == 32){
                stack.pop();
            }
            else stack.push(c);
        }
        for(char i : stack){
            str.append(i);
        }
        return str.toString();

    }
}
