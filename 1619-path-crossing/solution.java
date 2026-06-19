class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x=0, y=0;
        set.add(String.valueOf(x) + ',' + String.valueOf(y));
        for(char c : path.toCharArray()){
            if(c == 'N') y++;
            else if(c == 'E') x--;
            else if(c == 'S') y--;
            else if(c == 'W') x++;
            String key = String.valueOf(x)+','+String.valueOf(y);
            if(set.contains(key)) return true;
            set.add(key);
        }
        return false;
    }
}
