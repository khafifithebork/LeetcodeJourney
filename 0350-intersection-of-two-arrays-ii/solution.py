class Solution:
    def intersect(self, nums1: list[int], nums2: list[int]) -> list[int]:
        ans = []
        cnt = Counter(nums1)

        for num in nums2 :
            if cnt[num] > 0 :
                ans.append(num)
                cnt[num] -= 1
        return ans 
