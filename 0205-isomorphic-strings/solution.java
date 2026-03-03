class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0; i<s.length();i++){
            if(map.containsKey(Character.valueOf(s.charAt(i)))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(Character.valueOf(s.charAt(i)), Character.valueOf(t.charAt(i)));
            }
        }
        return true;
    }
}
