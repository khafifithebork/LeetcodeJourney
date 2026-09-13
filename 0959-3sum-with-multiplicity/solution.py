class Solution:
    def threeSumMulti(self, arr: List[int], target: int) -> int:
        arr.sort()
        ans, mod = 0, 10**9 + 7
        for i in range(len(arr)-2) :
            l, r = i+1, len(arr)-1
            while l < r :
                if arr[l] + arr[r] + arr[i] < target :
                    l+=1
                elif arr[l] + arr[r] + arr[i] > target :
                    r-=1
                else :
                    if arr[r] == arr[l] :
                        count = r - l + 1
                        ans += count * (count - 1) // 2
                        break
                    else : # arr[r] != arr[l]
                        leftcount = 1
                        rightcount = 1

                        while l + 1 < r and arr[l] == arr[l+1] :
                            leftcount += 1
                            l+=1

                        while r - 1 > l and arr[r] == arr[r - 1] :
                            rightcount += 1
                            r-=1

                        ans += leftcount * rightcount
                        r -= 1
                        l+=1                   

        return ans % mod
