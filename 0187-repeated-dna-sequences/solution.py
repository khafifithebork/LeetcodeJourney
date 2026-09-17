class Solution:
    def findRepeatedDnaSequences(self, s: str) -> list[str]:
        res = set()
        seen = set()
        seq = s[:10]
        seen.add(seq)

        for r in range(10, len(s)) :
            l = r-10+1
            seq = s[l:r+1]
            if seq in seen : 
                res.add(seq)
            else : seen.add(seq)
        return list(res)


