class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int ans =0;
        int start = 0;
        for(int end =0; end<s.length(); end++){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            ans=Math.max(ans, set.size());
        }
        return ans;
    }
}
