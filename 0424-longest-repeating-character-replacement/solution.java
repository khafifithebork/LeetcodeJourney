class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0, count=0, maxFreq=0, maxSize=0;
        for(int  right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
            int size = right - left + 1;
            if(size - maxFreq <= k){
                maxSize = Math.max(maxSize, size);
            }
            else{
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
        }
        return maxSize;
    }
}
