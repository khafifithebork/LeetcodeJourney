class Solution:
    def findAndReplacePattern(self, words: list[str], pattern: str) -> list[str]:
        ans = []

        for word in words :
            chartoP = {}
            ptoChar = {}
            ismatch = True
            
            for x, y in zip(word, pattern) :
                if (x in chartoP and chartoP[x] != y) or (y in ptoChar and ptoChar[y] != x) :
                    ismatch = False
                    break
            
                chartoP[x] = y
                ptoChar[y] = x

            if ismatch :
                ans.append(word)

        return ans
