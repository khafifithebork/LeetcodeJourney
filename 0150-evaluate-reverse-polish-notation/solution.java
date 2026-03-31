class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String t : tokens){
            if(t.equals("+")){
                int sec = stack.pop();
                int fir = stack.pop();
                stack.push(fir + sec);
            } 
            else if(t.equals("*")){
                int sec = stack.pop();
                int fir = stack.pop();
                stack.push(fir * sec);
            } 
            else if(t.equals("/")){
                int sec = stack.pop();
                int fir = stack.pop();
                stack.push(fir / sec);
            }
            else if(t.equals("-")){
                int sec = stack.pop();
                int fir = stack.pop();
                stack.push(fir - sec);
            }  
            else stack.push(Integer.parseInt(t));
        }
        return stack.pop();
    }
}
