class Solution:
    def threeConsecutiveOdds(self, arr: list[int]) -> bool:
        for i in range(1,len(arr)-1) :
            if arr[i]%2 == 1 and arr[i+1]%2 == 1 and arr[i-1]%2 == 1 :
                return True
        return False
