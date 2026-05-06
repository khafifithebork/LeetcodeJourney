class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        this.res = res;
        List<Integer> curr = new ArrayList<>();
        backtrack(1, curr, n, k);
        return res;
    }
    public void backtrack(int start, List<Integer> curr, int n, int k){
        if(curr.size() == k){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start; i < n+1; i++){
            curr.add(i);
            backtrack(i+1, curr, n, k);
            curr.remove(curr.size()-1);
        }
    }
}
