class Solution {
    public int findLucky(int[] arr) {
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a, map.getOrDefault(a,0) +1);
        }
        for(int k : map.keySet()){
            if(k == map.get(k)) ans = k;
        }
        return (ans > 0) ? ans : -1;
    }
}
