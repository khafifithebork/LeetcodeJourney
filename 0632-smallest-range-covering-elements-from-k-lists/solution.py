import heapq
class Solution(object):
    def smallestRange(self, nums):
        """
        :type nums: List[List[int]]
        :rtype: List[int]
        """
        heap = []
        currMax = float('-inf')
        for i in range(len(nums)) :
            heapq.heappush(heap, (nums[i][0], i, 0))
            currMax = max(currMax, nums[i][0])
        a, b = heap[0][0], currMax
        while heap :
            minVal, listIdx, elemIdx = heapq.heappop(heap)
            if currMax - minVal < b - a :
                a, b = minVal, currMax
            if elemIdx + 1 == len(nums[listIdx]) :
                break
            
            nextVal = nums[listIdx][elemIdx+1]
            heapq.heappush(heap, (nextVal, listIdx, elemIdx+1))
            currMax = max(currMax, nextVal)
        return [a, b]
