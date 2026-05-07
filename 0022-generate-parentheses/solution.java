class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(n,0,0,"", list);
        return list;
    }
    public void backtrack(int n, int start, int end, String s, List<String> output){
        if(s.length() == 2*n){
            output.add(s);
            return;
        }
        if(start < n){
            backtrack(n, start+1, end, s + "(", output);
        }
        if(end < start){
            backtrack(n, start, end+1, s + ")", output);
        }
    }
}
