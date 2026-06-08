class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int maxOdd=0;
        int minEven = Integer.MAX_VALUE;
        for(int freq : map.values()){
            if(freq%2==0) minEven = Math.min(freq,minEven);
            else if(freq%2!=0) maxOdd = Math.max(freq,maxOdd);
        }
        return maxOdd - minEven;
    }
}
