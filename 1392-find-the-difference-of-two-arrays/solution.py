class Solution(object):
    def findDifference(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[List[int]]
        """
        seti = set(nums1)
        setj = set(nums2)
        ans1, ans2 = [], []
        for i in seti :
            if i not in setj :
                ans1.append(i)
        for j in setj :
            if j not in seti :
                ans2.append(j)
        return [ans1, ans2]
