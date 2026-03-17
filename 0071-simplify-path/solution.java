class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder("");
        String[] components = path.split("/");
        for(String comp : components){
            if(comp.equals("") || comp.equals(".")){
                continue;
            }
            if(comp.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else{
                stack.push(comp);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        for(String s : stack){
            res.append("/").append(s);
        }
        return res.toString();
    }
}
