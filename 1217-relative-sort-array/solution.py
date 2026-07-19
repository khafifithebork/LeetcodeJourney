class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        count = [0] * 1001
        for arr in arr1 :
            count[arr]+=1
        result = []
        for num in arr2 :
            result.extend([num] * count[num])
            count[num]=0
        for num in range(1001) :
            if count[num] > 0 :
                result.extend([num] * count[num])
                count[num] = 0
        return result
