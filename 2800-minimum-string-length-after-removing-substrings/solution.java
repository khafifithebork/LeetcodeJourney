class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++){
            if((!stack.isEmpty() && stack.peek() == 'A' && str[i] == 'B') || (!stack.isEmpty() && stack.peek() == 'C' && str[i] == 'D')){
                stack.pop();
            }
            else stack.push(str[i]);
        }
        return stack.size();
    }
}
