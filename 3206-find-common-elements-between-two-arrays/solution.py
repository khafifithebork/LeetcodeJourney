class Solution(object):
    def findIntersectionValues(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        count1, count2 = 0, 0
        for a in nums1 :
            if a in nums2 :
                count1 += 1
        for b in nums2 :
            if b in nums1 :
                count2 += 1
        return [count1, count2]
