class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] str = s.split(" ");
        char[] charr = pattern.toCharArray();
        if(charr.length != str.length) return false;
        for(int i=0;i<str.length;i++){
            if(map.containsKey(charr[i])){
                if(!map.get(charr[i]).equals(str[i])) return false;
            }
            else{
                if(map.containsValue(str[i])) return false;
            }
            map.put(charr[i],str[i]);
        }
        return true;
    }
}
