class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()){
            set.add(c);
        }
        
        int ans=0;
        for(String word : words){
            boolean isConsistent = true;
            for(char c : word.toCharArray()){
                if(!set.contains(c)) isConsistent = false;
            }
            if(isConsistent) ans++;
        }
        return ans;
    }
}
