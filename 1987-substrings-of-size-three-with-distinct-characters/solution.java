class Solution {
    public int countGoodSubstrings(String s) {
        int count =0;
        for(int i =0;i<=s.length()-3;i++){
            String subStr = s.substring(i, i+3);
            if(isGood(subStr)) count++;
        }
        return count;
    }
    public boolean isGood(String s){
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }
}
