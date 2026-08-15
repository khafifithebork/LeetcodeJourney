class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        chars = list(s)
        l,r = 0,len(s)-1
        while l < r :
            if not chars[l].isalpha() :
                l+=1
            elif not chars[r].isalpha() :
                r-=1
            if chars[r].isalpha() and chars[l].isalpha():
                chars[l], chars[r] = chars[r], chars[l]
                l+=1
                r-=1
        return "".join(chars)
