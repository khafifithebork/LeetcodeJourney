class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : text.toCharArray()){
            if(c == 'b' || c=='a' || c=='l' || c=='o' || c=='n'){
                map.put(c, map.getOrDefault(c,0)+1);
            }
        }
        if(map.containsKey('o')) map.put('o',map.get('o') / 2);
        if(map.containsKey('l')) map.put('l',map.get('l') / 2);
        if(map.containsKey('b') && map.containsKey('a') && map.containsKey('l') && map.containsKey('o') && map.containsKey('n')){
            return Collections.min(map.values());
        }
        else return 0;

    }
}
