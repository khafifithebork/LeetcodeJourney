class Solution:
    def findMatrix(self, nums: list[int]) -> list[list[int]]:
        ans = []
        freq = Counter(nums)
        while True :
            row = []
            for num in nums :
                if freq[num] > 0 and num not in row :
                    row.append(num)
                    freq[num] -= 1
            
            ans.append(row)
            if sum(freq[num] for num in nums) == 0 :
                break

        return ans
