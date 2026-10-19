class Solution:
    def twoOutOfThree(self, nums1: list[int], nums2: list[int], nums3: list[int]) -> list[int]:
        seen = set()

        for a in nums1 :
            for b in nums2 :
                for c in nums3 :
                    if a == b or a == c :
                        seen.add(a)
                    elif b == a or b == c :
                        seen.add(b)
                    elif c == a or c == b :
                        seen.add(c)

        return list(seen)
