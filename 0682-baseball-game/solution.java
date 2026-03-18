class Solution {
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        int res = 0;
        for(String op : operations){
            if(op.equals("+")){
                if(stack.size()>=2){
                    int top1 = Integer.parseInt(stack.pop());
                    int top2 = Integer.parseInt(stack.peek());
                    stack.push(Integer.toString(top1));
                    stack.push(Integer.toString(top2 + top1));
                }
            }
            else if(op.equals("D")){
                int doub = Integer.parseInt(stack.peek()) * 2;
                stack.push(Integer.toString(doub));
            }
            else if(op.equals("C")){
                stack.pop();
            }
            else{
                stack.push(op);
            }
        }
        for(String s : stack){
            res += Integer.parseInt(s);
        }
        return res;
    }
}
