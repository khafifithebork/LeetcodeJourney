from collections import Counter
class Solution:
    def findXSum(self, nums: List[int], k: int, x: int) -> List[int]:
        n = len(nums)
        res = []
        freq = Counter(nums[:k])
        def getXSum() :
            topx = sorted(freq.keys(), key=lambda e: (freq[e], e), reverse=True)[:x]
            return sum(freq[e]*e for e in topx)
        res.append(getXSum())

        for right in range(k, n) :
            freq[nums[right]] += 1
            freq[nums[right-k]] -= 1
            if freq[nums[right-k]] == 0 :
                del freq[nums[right-k]]
            res.append(getXSum())
        return res            

