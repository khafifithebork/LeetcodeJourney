class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        count=0
        deq = deque([[idx,val] for idx,val in enumerate(tickets)])
        while True :
            i,v = deq.popleft()
            if i==k and v==1 :
                count+=1
                break
            v-=1
            if v > 0:
                deq.append([i,v])
            count+=1
        return count
            
