class Solution {
    public String decodeString(String s) {
        int index=0;
        Stack<Integer> digits = new Stack<>();
        Stack<String> stack = new Stack<>();
        String str = "";
        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int num=0;
                while(Character.isDigit(s.charAt(index))){
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                digits.push(num);
            }
            else if(s.charAt(index) == '['){
                stack.push(str);
                str = "";
                index++;
            }
            else if(s.charAt(index)== ']'){
                StringBuilder temp = new StringBuilder(stack.pop());
                int digit = digits.pop();
                for(int i = 0; i<digit; i++){
                    temp.append(str);
                }
                str = temp.toString();
                index++;
            }
            else{
                str += s.charAt(index);
                index++;
            }
        }
        return str;
    }
}
