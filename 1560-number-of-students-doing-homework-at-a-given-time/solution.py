class Solution(object):
    def busyStudent(self, startTime, endTime, queryTime):
        """
        :type startTime: List[int]
        :type endTime: List[int]
        :type queryTime: int
        :rtype: int
        """
        ans = 0
        for i in range(0, len(endTime)) :
            if queryTime >= startTime[i] and queryTime <= endTime[i] :
                ans+=1
        return ans
