class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        if (s1.length() > s2.length()) return false;
        for(int i = 0; i< s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        
        int left = 0;
        
        for(int j = 0; j < s1.length(); j++){
            map2.put(s2.charAt(j), map2.getOrDefault(s2.charAt(j), 0) + 1);
        }
        
        if(map1.equals(map2)) return true;
        
        for(int right = s1.length(); right<s2.length(); right++){
            map2.put(s2.charAt(right), map2.getOrDefault(s2.charAt(right), 0) + 1);
            map2.put(s2.charAt(left), map2.get(s2.charAt(left)) - 1);
            left++;
            if (map2.get(s2.charAt(left-1)) == 0) {
                map2.remove(s2.charAt(left-1));
            }
            if(map1.equals(map2)==true){
                return true;
            }
        }
        return false;
    }
}
