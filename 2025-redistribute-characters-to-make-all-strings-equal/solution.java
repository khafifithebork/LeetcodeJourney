class Solution {
    public boolean makeEqual(String[] words) {
        int[] totCount = new int[26];
        int n = words.length;
        for(String word : words){
            for(char c : word.toCharArray()){
                totCount[c-'a']++;
            }
        }
        for(int count : totCount){
            if(count%n!=0) return false;
        }
        return true;
    }
}
