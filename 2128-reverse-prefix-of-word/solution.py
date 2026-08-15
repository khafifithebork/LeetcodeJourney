class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        chars = list(word)
        r = word.find(ch)
        if r == -1 : return word
        l = 0
        while l < r :
            chars[l],chars[r] = chars[r],chars[l]
            l+=1
            r-=1
        return "".join(chars)
