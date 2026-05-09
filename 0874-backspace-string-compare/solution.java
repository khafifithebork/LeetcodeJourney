class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '#' && !stackS.isEmpty()) stackS.pop();
            else if(c == '#' && stackS.isEmpty()) continue;
            else stackS.push(c);
        }
        for(char c : t.toCharArray()){
            if(c == '#' && !stackT.isEmpty()) stackT.pop();
            else if(c == '#' && stackT.isEmpty()) continue;
            else stackT.push(c);
        }
        if(stackS.size() != stackT.size()) return false;
        while(!stackS.isEmpty()){
            if(stackS.pop() != stackT.pop()) return false;
        }
        return true;
    }
}
