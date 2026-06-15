class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : chars.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        int ans=0;
        for(String s : words){
            if(canForm(s, freq)){
                ans+=s.length();
            }
        }
        return ans;
    }
    public boolean canForm(String s, Map<Character,Integer> map){
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);

            if(freq.get(c) > map.getOrDefault(c,0)) return false;
        }
        return true;
    }
}
