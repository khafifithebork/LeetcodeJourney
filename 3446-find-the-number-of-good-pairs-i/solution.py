class Solution:
    def numberOfPairs(self, nums1: List[int], nums2: List[int], k: int) -> int:
        count = 0

        for i in nums1 :
            for j in nums2 :
                if i % (j * k) == 0 :
                    count += 1
        return count
