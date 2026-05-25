class Solution {
    public int maxVowels(String s, int k) {
        char[] str = s.toCharArray();
        int maxCount = Integer.MIN_VALUE;
        int currCount = 0;
        for(int i = 0; i<k;i++){
            if(isVowel(str[i])) currCount++;
        }
        maxCount = currCount;
        for(int right = k; right<str.length;right++){
            if(isVowel(str[right])){
                currCount++;
            }
            if(isVowel(str[right-k])){currCount--;}
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;
    }
    public boolean isVowel(char c){
        return c == 'a' || c=='e'|| c == 'i' || c=='o' || c == 'u';
    }
}
