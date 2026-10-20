class Solution:
    def mergeSimilarItems(self, items1: list[list[int]], items2: list[list[int]]) -> list[list[int]]:
        mapp = defaultdict(int)

        for val, weight in items1 + items2 :
            mapp[val] += weight
        
        return sorted(mapp.items())
