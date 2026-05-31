class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<cards.length; i++){
            int card = cards[i];
            if(map.containsKey(card)){
                int result = i - map.get(card) + 1;
                ans = Math.min(ans, result);
            }
            map.put(card, i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
