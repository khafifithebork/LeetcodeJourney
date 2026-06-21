class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        int[] gloFreq = new int[26];
        Arrays.fill(gloFreq, Integer.MAX_VALUE);

        for(String word : words){
            int[] currFreq = new int[26];
            for(char c : word.toCharArray()){
                currFreq[c-'a']++;
            }
            for(int i=0;i<26;i++){
                gloFreq[i] = Math.min(gloFreq[i], currFreq[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<26;i++){
            while(gloFreq[i] > 0){
                ans.add(String.valueOf((char) (i + 'a')));
                gloFreq[i]--;
            }
        }
        return ans;
    }
}
