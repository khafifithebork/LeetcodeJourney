class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> list[str]:
        ans = []
        counter = {}
        arr = s1.split(' ') + s2.split(' ')

        for a in arr :
            counter[a] = counter.get(a, 0) + 1
        
        for a in arr :
            if counter[a] == 1 :
                ans.append(a)
        return ans
