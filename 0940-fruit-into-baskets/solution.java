class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        int start=0, end=0, maxLen = 0;
        while(end<fruits.length){
            map.put(fruits[end], map.getOrDefault(fruits[end],0)+1);
            while(map.size()>=3){
                map.put(fruits[start], map.get(fruits[start])-1);
                if(map.get(fruits[start]) == 0) map.remove(fruits[start]);
                start++;
            }
            int currLen = end-start+1;
            maxLen = Math.max(maxLen,currLen);
            end++;
        }
        return maxLen;
    }
}
