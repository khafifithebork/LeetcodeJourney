class Solution(object):
    def reversePrefix(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        l, r = 0, k-1
        arr = list(s)
        while l < r :
            arr[l], arr[r] = arr[r], arr[l]
            l+=1
            r-=1
        return "".join(arr)
