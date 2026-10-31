class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        cntS = Counter(s)
        cntT = Counter(t)
        for ch in t :
            if cntT[ch] > cntS[ch] :
                return ch
            
